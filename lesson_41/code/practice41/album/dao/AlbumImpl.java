package practice41.album.dao;

import practice41.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;


public class AlbumImpl implements Album {
    static Comparator<Photo> comparator = (p1, p2) -> {
        int res = p1.getDate().compareTo(p2.getDate());//сортировка по дате
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());// сортировака по фото ID
    };

    //fields
    private Photo[] photos; //это массив объектов типа Photo
    private int size; //переменная отвечает за общее кол-во элементов массива

    //constructor
    public AlbumImpl(int capacity) {
        photos = new Photo[capacity];
    }

    @Override
    public boolean addPhoto(Photo photo) {
        //нельзя добавить null, нельзя photo.length == capacity,нельзя добавить то же самое фото, проверка на два Id
        //нужно иметь отсортированный массив объектов т.к binarySearch работае только с такими массивами
        //binarySearch находит и возвращает индекс искомого элемента, если находит
        //если элемент массива не найдет, то binarySearch вернет отрицательное число, где должет стоять элемент
        //со знаком минус и на один меньше
        //нужно применить binarySearch чтобы найти место куда вставлять фото
        // тогда можно делать addPhoto
        if (photo == null || photos.length == size || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(photos,0,size,photo,comparator);//нашли место куда вставить фото
        //массив оказывается после этого отсортированным
        index = index >=0 ? index : - index -1;//обрабатываем индекс
        System.arraycopy(photos,index,photos,index +1,size-index);//копируем элементы массива от индекса на одно место вправо
        photos[index] = photo;//вставляем фото
        size++;
    return true;
    }



    @Override
    public boolean removePhoto(int photoId, int albumId) {
        for (int i = 0; i < size; i++) {
            if(photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId){
            System.arraycopy(photos,i +1,photos,i,size-1-i);
            photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        Photo photo = getPhotoFromAlbum(photoId,albumId);//нашли фото по двум ИД
        if (photo == null){
            return false;
        }
        photo.setUrl(url);
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        Photo pattern = new Photo(albumId,photoId, null, null,null);//создаем объект, с которым сравниваем фото из массива
        for (int i = 0; i < size; i++) {
            if (pattern.equals(photos [i])){
                return photos [i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {

        return findByPredicate (p -> p.getAlbumId () == albumId);
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {

       //создадим фото с индексом максим.ранней фотографии и фото с максим. большим индексом
       //сравнивая с этими фото будем искать индексы фото from и to
       //поиск опять будем использовать binarySearch
        Photo pattern = new Photo(0,Integer.MIN_VALUE,null,null,dateFrom.atStartOfDay());
        int from = -Arrays.binarySearch(photos,0,size,pattern,comparator)-1;//находим индекс from
        pattern = new Photo(0,Integer.MAX_VALUE,null,null, LocalDateTime.of(dateTo, LocalTime.MAX));//находим правый край
        int to = - Arrays.binarySearch(photos,from,size,pattern,comparator)-1;

        return Arrays.copyOfRange(photos,from,to);//создаем новый массив с нужными нам фото
    }

    @Override
    public int size() {

        return size;
    }

        private Photo[] findByPredicate (Predicate<Photo>predicate){
        Photo[] res = new Photo[size];
        int j = 0;//счетчик найденных по условию фото
            for (int i = 0; i < size; i++) {
                if(predicate.test(photos [i])){
                    res [j++] = photos[i];
                }
            }
            return Arrays.copyOf(res,j);//копируем только ту часть, где нет null
        }
}

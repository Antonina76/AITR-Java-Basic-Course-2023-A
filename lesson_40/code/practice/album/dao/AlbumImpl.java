package practice.album.dao;

import employee_company.model.Employee35;
import practice.album.model.Photo;

import java.time.LocalDate;
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
        //нужно иметь отсортированный массив объектов
        //нужно применить binarySearch чтобы найти место куда вставлять фото
        // тогда можно делать addPhoto
        if (photo == null || photos.length == size || getPhotoFromAlbum(photo.getPhotoId(), photo.getAlbumId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(photos,0,size,photo,comparator);//нашли место куда вставить фото
        index = index >=0 ? index : - index -1;
        System.arraycopy(photo,index,photo,index +1,size-index);//копируем элементы массива от индекса на одно место вправо
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
        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }

        private Photo [] findByPredicate (Predicate<Photo>predicate){
        Photo [] res = new Photo[size];
        int j = 0;//счетчик найденных по условию фото
            for (int i = 0; i < size; i++) {
                if(predicate.test(photos [i])){
                    res [j++] = photos[i];
                }
            }
            return Arrays.copyOf(res,j);//копируем только ту часть, где нет null
        }
}

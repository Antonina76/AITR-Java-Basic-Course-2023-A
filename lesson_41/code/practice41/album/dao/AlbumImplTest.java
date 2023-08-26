package practice41.album.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice41.album.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {
    Album albums;
    LocalDateTime now = LocalDateTime.now();
    Photo [] photos = new Photo [6];


    @BeforeEach
    void setUp() {
        albums = new AlbumImpl(7);
        photos[0] = new Photo(1,1,"title1","url1",now.minusDays(6));
        photos[1] = new Photo(1,2,"title2","url2",now.minusDays(6));
        photos[2] = new Photo(1,3,"title3","url3",now.minusDays(6));
        photos[3] = new Photo(2,5,"title1","url1",now.minusDays(6));
        photos[4] = new Photo(2,4,"title4","url4",LocalDateTime.of(now.minusDays(2).toLocalDate(), LocalTime.MAX));
        photos[5] = new Photo(1,4,"title4","url1",LocalDateTime.of(now.minusDays(2).toLocalDate(), LocalTime.MAX));
     for (int i = 0; i < photos.length; i++) {
            albums.addPhoto(photos[i]);
        }
   }

    @Test
    void addPhoto() {
       assertFalse(albums.addPhoto(null));
        assertFalse(albums.addPhoto(photos[4]));
        assertEquals(6,albums.size());
        Photo photo = new Photo(1,5,"title 5","url 5",now.minusDays(3));
        assertTrue(albums.addPhoto(photo));
        assertEquals(7,albums.size());
        Photo photo1 = new Photo(1,6,"title 6","url 6",now.minusDays(3));
        assertFalse(albums.addPhoto(photo1));//добавление сверх capacity
    }

    @Test
    void removePhoto() {
        assertFalse(albums.removePhoto(4,7));
        assertTrue(albums.removePhoto(1,1));
        assertEquals(5,albums.size());
        assertNull(albums.getPhotoFromAlbum(1,1));

    }

    @Test
    void updatePhoto() {
        assertTrue(albums.updatePhoto(1,1,"newUrl"));
        assertEquals("newUrl",albums.getPhotoFromAlbum(1,1).getUrl());
    }

    @Test
    void getPhotoFromAlbum() {
        assertEquals(photos[0],albums.getPhotoFromAlbum(1,1));
        assertNull(albums.getPhotoFromAlbum(3,3));
    }

    @Test
    void getAllPhotoFromAlbum() {
        Photo[]actual = albums.getAllPhotoFromAlbum(2);
        Arrays.sort(actual);
        Photo[] expected = {photos[3],photos[4]};
        assertArrayEquals(actual,expected);
    }

    @Test
    void getPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate();
        System.out.println(ld);
        Photo[]actual = albums.getPhotoBetweenDate(ld.minusDays(7),ld.minusDays(5));
        Arrays.sort(actual);
        Photo[]expected = {photos[0],photos[1],photos[2],photos[3]};
        assertArrayEquals(expected,actual);
    }

    @Test
    void size() {

        assertEquals(6,albums.size());
    }
}
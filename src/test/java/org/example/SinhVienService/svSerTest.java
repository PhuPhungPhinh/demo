package org.example.SinhVienService;

import org.example.SinhVien.sv;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class svSerTest {
  private svSer sucVat;
    @BeforeEach
    void setUp() {
        sucVat= new svSer();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {

    }

    @Test
    void findById() {
    }

    @Test
    void update() {
       sv sida = new sv(1,"Lol",12,"qwerty");
       sucVat.add(sida);

       sida.setName("qa");
       sida.setDiaChi("ws");
       sida.setTuoi(156);
        assertEquals("qa",sucVat.findById(1).get().getName());
        assertEquals("ws",sucVat.findById(1).get().getDiaChi());
        assertEquals(156,sucVat.findById(1).get().getTuoi());


    }
    @Test
    void updateNull () {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {

            sucVat.Update(null);
        });
        assertEquals("update loi",exception.getMessage());
    }
    @Test
    void updateTenNull () {
        sv sida = new sv(1,"Lol",12,"qwerty");
        sucVat.add(sida);
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            sucVat.Update(new sv(1,null,12,"qwerty"))
        );
        assertEquals("Name null",exception.getMessage());
    }
//    @Test
//    void updateID () {
//        sv sida = new sv(1,"Lol",12,"qwerty");
//        sucVat.add(sida);
//        Exception exception = assertThrows(IllegalArgumentException.class, () ->
//                sucVat.Update(new sv(2,"Lol",12,"qwerty"))
//        );
//        assertEquals("Trung ma",exception.getMessage());
//    }
}
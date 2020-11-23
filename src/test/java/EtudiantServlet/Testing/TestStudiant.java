package EtudiantServlet.Testing;

import static org.junit.jupiter.api.Assertions.*;

import demo.EtudiantBachelor3;
import demo.mydemo;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestStudiant {
    String myname;
    mydemo d;

    @BeforeEach
    public void setUp() {
        myname = "Guillaume";
        d = new mydemo(myname,25);
        System.out.println("setup ok !!!");
    }

    @Test
    void testBachelor3GetAllContainsNiveau(){
        //fail("KO");
        String result = d.giveAllEtudiantBachelor3();
        Assert.assertThat(result, StringContains.containsString(EtudiantBachelor3.NIVEAU));
        System.out.println("T1 ok !!!");
    }
}

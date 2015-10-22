package androidtitlan.gdg.recyclerview_examples;

import org.junit.Test;

import androidtitlan.gdg.recyclerview_examples.model.Picture;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class PictureTest {

    @Test
    public void modelPictureNotIsNull() throws Exception{
        Picture picture = new Picture("name_photo",12345);
        assertNotNull(picture.getName());
        assertTrue(picture.getImage() > 0);
    }
}
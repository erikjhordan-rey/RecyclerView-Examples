package io.github.erikjhordanrey.recyclerview_sample.model;

import java.util.ArrayList;

public interface LoaderListener {

    void onFinished(ArrayList<Picture> pictureList);
}

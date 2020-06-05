package es.ua.dccia.multimedia;

import android.graphics.Bitmap;

public class Medio {
    private String titulo;
    private String autor;
    private String url;
    private int mImagenResourceId;
    // audio resource ID
    private int mAudioResourceId;
    private int mVideoResourceId;

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public int getmVideoResourceId() {
        return mVideoResourceId;
    }

    public void setmVideoResourceId(int mVideoResourceId) {
        this.mVideoResourceId = mVideoResourceId;
    }

    public Medio(String titulo, String autor , int imageResourceId) {
        this.titulo = titulo;
        this.autor = autor;
        this.mImagenResourceId = imageResourceId;
    }

    public Medio(String titulo, String autor, int mImagenResourceId, int mAudioResourceId) {
        this.titulo = titulo;
        this.autor = autor;
        this.mImagenResourceId = mImagenResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getmImagenResourceId() {
        return mImagenResourceId;
    }

    public void setmImagenResourceId(int mImagenResourceId) {
        this.mImagenResourceId = mImagenResourceId;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

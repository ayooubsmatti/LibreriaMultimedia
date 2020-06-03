package es.ua.dccia.multimedia;

import android.graphics.Bitmap;

public class Medio {
    private String titulo;
    private String autor;
    private String url;
    private int mImagenResourceId;
    public Medio(String titulo, String autor ,int imageResourceId) {
        this.titulo = titulo;
        this.autor = autor;
        this.mImagenResourceId = imageResourceId;
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

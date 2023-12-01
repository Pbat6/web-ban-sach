package vn.the.spring.webbansach.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Blob;
@Entity
@Data
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageId;

    @Column(name = "image_name", length = 256)
    private String imageName;

    @Column(name = "main_image")
    private Boolean mainImage;

    @Column(name = "link")
    private String link;

    @Column(name = "data")
    @Lob
    private String data;

    @ManyToOne(cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH
    })  
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
}

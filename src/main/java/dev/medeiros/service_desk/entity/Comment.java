package dev.medeiros.service_desk.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    private String message;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @ManyToOne
    private User author;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

}

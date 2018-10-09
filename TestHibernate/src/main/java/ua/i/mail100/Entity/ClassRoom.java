package ua.i.mail100.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "class_room")
public class ClassRoom {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "room")
    private Long roomNumber;

    @OneToMany(mappedBy = "classRoom", fetch = FetchType.EAGER)
    private List<Student> students;

    public ClassRoom(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ClassRoom() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", students=" + students +
                '}';
    }
}

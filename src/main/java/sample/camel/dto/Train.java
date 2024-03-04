package sample.camel.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "trains")
public class Train {

    @Id
    private int id_train;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp dt_start;

    private int id_station_start;

    private String train_name;

    public int getId_train() {
        return id_train;
    }

    public void setId_train(int id_train) {
        this.id_train = id_train;
    }

    public Timestamp getDt_start() {
        return dt_start;
    }

    public void setDt_start(Timestamp dt_start) {
        this.dt_start = dt_start;
    }

    public int getId_station_start() {
        return id_station_start;
    }

    public void setId_station_start(int id_station_start) {
        this.id_station_start = id_station_start;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

}

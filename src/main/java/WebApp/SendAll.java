package WebApp;

import Entity.AllResources;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * Created by adyachenko on 11.10.16.
 */
public class SendAll {
    private long id;

    private List<AllResources> content;

    public SendAll(long id, List<AllResources> content){
        this.id = id;
        this.content = content;
    }


    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public List<AllResources> getContent() {
        return content;
    }

}

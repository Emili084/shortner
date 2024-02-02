package MicroProjectSpring.Shortener.bdd;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Url {
    @JsonProperty("id")
    private String id;
    @JsonProperty("shortUrl")
    private String shortUrl;
    @JsonProperty("reelUrl")
    private URI reelUrl;
    @JsonProperty("XRemovalToken")
    private String XRemovalToken;

    public Url() {
    }

    @JsonCreator
    public Url(
        @JsonProperty("id") String id,
        @JsonProperty("shortUrl") String shortUrl,
        @JsonProperty("reelUrl") URI reelUrl,
        @JsonProperty("XRemovalToken") String XRemovalToken) {
        this.id = id;
        this.shortUrl = shortUrl;
        this.reelUrl = reelUrl;
        this.XRemovalToken = XRemovalToken;
    }

    public String getId() {
        return id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public URI getReelUrl() {
        return reelUrl;
    }

    public String getXRemovalToken() {
        return XRemovalToken;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public void setReelUrl(URI reelUrl) {
        this.reelUrl = reelUrl;
    }

    public void setXRemovalToken(String XRemovalToken) {
        this.XRemovalToken = XRemovalToken;
    }

    @Override
    public String toString() {
        return "Url{" +
            "id='" + id + '\'' +
            ", shortUrl='" + shortUrl + '\'' +
            ", reelUrl=" + reelUrl +
            ", XRemovalToken='" + XRemovalToken + '\'' +
            '}';
    }

}

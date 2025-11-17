package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GeneratedVideo extends GeneratedVideo {

  private final Optional<Video> video;

  private AutoValue_GeneratedVideo(
      Optional<Video> video) {
    this.video = video;
  }

  @JsonProperty("video")
  @Override
  public Optional<Video> video() {
    return video;
  }

  @Override
  public String toString() {
    return "GeneratedVideo{"
        + "video=" + video
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GeneratedVideo) {
      GeneratedVideo that = (GeneratedVideo) o;
      return this.video.equals(that.video());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= video.hashCode();
    return h$;
  }

  @Override
  public GeneratedVideo.Builder toBuilder() {
    return new AutoValue_GeneratedVideo.Builder(this);
  }

  static final class Builder extends GeneratedVideo.Builder {
    private Optional<Video> video = Optional.empty();
    Builder() {
    }
    Builder(GeneratedVideo source) {
      this.video = source.video();
    }
    @Override
    public GeneratedVideo.Builder video(Video video) {
      this.video = Optional.of(video);
      return this;
    }
    @Override
    GeneratedVideo.Builder video(Optional<Video> video) {
      if (video == null) {
        throw new NullPointerException("Null video");
      }
      this.video = video;
      return this;
    }
    @Override
    public GeneratedVideo build() {
      return new AutoValue_GeneratedVideo(
          this.video);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerateVideosSource extends GenerateVideosSource {

  private final Optional<String> prompt;

  private final Optional<Image> image;

  private final Optional<Video> video;

  private AutoValue_GenerateVideosSource(
      Optional<String> prompt,
      Optional<Image> image,
      Optional<Video> video) {
    this.prompt = prompt;
    this.image = image;
    this.video = video;
  }

  @JsonProperty("prompt")
  @Override
  public Optional<String> prompt() {
    return prompt;
  }

  @JsonProperty("image")
  @Override
  public Optional<Image> image() {
    return image;
  }

  @JsonProperty("video")
  @Override
  public Optional<Video> video() {
    return video;
  }

  @Override
  public String toString() {
    return "GenerateVideosSource{"
        + "prompt=" + prompt + ", "
        + "image=" + image + ", "
        + "video=" + video
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerateVideosSource) {
      GenerateVideosSource that = (GenerateVideosSource) o;
      return this.prompt.equals(that.prompt())
          && this.image.equals(that.image())
          && this.video.equals(that.video());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= prompt.hashCode();
    h$ *= 1000003;
    h$ ^= image.hashCode();
    h$ *= 1000003;
    h$ ^= video.hashCode();
    return h$;
  }

  @Override
  public GenerateVideosSource.Builder toBuilder() {
    return new AutoValue_GenerateVideosSource.Builder(this);
  }

  static final class Builder extends GenerateVideosSource.Builder {
    private Optional<String> prompt = Optional.empty();
    private Optional<Image> image = Optional.empty();
    private Optional<Video> video = Optional.empty();
    Builder() {
    }
    Builder(GenerateVideosSource source) {
      this.prompt = source.prompt();
      this.image = source.image();
      this.video = source.video();
    }
    @Override
    public GenerateVideosSource.Builder prompt(String prompt) {
      this.prompt = Optional.of(prompt);
      return this;
    }
    @Override
    GenerateVideosSource.Builder prompt(Optional<String> prompt) {
      if (prompt == null) {
        throw new NullPointerException("Null prompt");
      }
      this.prompt = prompt;
      return this;
    }
    @Override
    public GenerateVideosSource.Builder image(Image image) {
      this.image = Optional.of(image);
      return this;
    }
    @Override
    GenerateVideosSource.Builder image(Optional<Image> image) {
      if (image == null) {
        throw new NullPointerException("Null image");
      }
      this.image = image;
      return this;
    }
    @Override
    public GenerateVideosSource.Builder video(Video video) {
      this.video = Optional.of(video);
      return this;
    }
    @Override
    GenerateVideosSource.Builder video(Optional<Video> video) {
      if (video == null) {
        throw new NullPointerException("Null video");
      }
      this.video = video;
      return this;
    }
    @Override
    public GenerateVideosSource build() {
      return new AutoValue_GenerateVideosSource(
          this.prompt,
          this.image,
          this.video);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_GenerateVideosParameters extends GenerateVideosParameters {

  private final Optional<String> model;

  private final Optional<String> prompt;

  private final Optional<Image> image;

  private final Optional<Video> video;

  private final Optional<GenerateVideosSource> source;

  private final Optional<GenerateVideosConfig> config;

  private AutoValue_GenerateVideosParameters(
      Optional<String> model,
      Optional<String> prompt,
      Optional<Image> image,
      Optional<Video> video,
      Optional<GenerateVideosSource> source,
      Optional<GenerateVideosConfig> config) {
    this.model = model;
    this.prompt = prompt;
    this.image = image;
    this.video = video;
    this.source = source;
    this.config = config;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
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

  @JsonProperty("source")
  @Override
  public Optional<GenerateVideosSource> source() {
    return source;
  }

  @JsonProperty("config")
  @Override
  public Optional<GenerateVideosConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "GenerateVideosParameters{"
        + "model=" + model + ", "
        + "prompt=" + prompt + ", "
        + "image=" + image + ", "
        + "video=" + video + ", "
        + "source=" + source + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GenerateVideosParameters) {
      GenerateVideosParameters that = (GenerateVideosParameters) o;
      return this.model.equals(that.model())
          && this.prompt.equals(that.prompt())
          && this.image.equals(that.image())
          && this.video.equals(that.video())
          && this.source.equals(that.source())
          && this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= prompt.hashCode();
    h$ *= 1000003;
    h$ ^= image.hashCode();
    h$ *= 1000003;
    h$ ^= video.hashCode();
    h$ *= 1000003;
    h$ ^= source.hashCode();
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public GenerateVideosParameters.Builder toBuilder() {
    return new AutoValue_GenerateVideosParameters.Builder(this);
  }

  static final class Builder extends GenerateVideosParameters.Builder {
    private Optional<String> model = Optional.empty();
    private Optional<String> prompt = Optional.empty();
    private Optional<Image> image = Optional.empty();
    private Optional<Video> video = Optional.empty();
    private Optional<GenerateVideosSource> source = Optional.empty();
    private Optional<GenerateVideosConfig> config = Optional.empty();
    Builder() {
    }
    Builder(GenerateVideosParameters source) {
      this.model = source.model();
      this.prompt = source.prompt();
      this.image = source.image();
      this.video = source.video();
      this.source = source.source();
      this.config = source.config();
    }
    @Override
    public GenerateVideosParameters.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    GenerateVideosParameters.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public GenerateVideosParameters.Builder prompt(String prompt) {
      this.prompt = Optional.of(prompt);
      return this;
    }
    @Override
    GenerateVideosParameters.Builder prompt(Optional<String> prompt) {
      if (prompt == null) {
        throw new NullPointerException("Null prompt");
      }
      this.prompt = prompt;
      return this;
    }
    @Override
    public GenerateVideosParameters.Builder image(Image image) {
      this.image = Optional.of(image);
      return this;
    }
    @Override
    GenerateVideosParameters.Builder image(Optional<Image> image) {
      if (image == null) {
        throw new NullPointerException("Null image");
      }
      this.image = image;
      return this;
    }
    @Override
    public GenerateVideosParameters.Builder video(Video video) {
      this.video = Optional.of(video);
      return this;
    }
    @Override
    GenerateVideosParameters.Builder video(Optional<Video> video) {
      if (video == null) {
        throw new NullPointerException("Null video");
      }
      this.video = video;
      return this;
    }
    @Override
    public GenerateVideosParameters.Builder source(GenerateVideosSource source) {
      this.source = Optional.of(source);
      return this;
    }
    @Override
    GenerateVideosParameters.Builder source(Optional<GenerateVideosSource> source) {
      if (source == null) {
        throw new NullPointerException("Null source");
      }
      this.source = source;
      return this;
    }
    @Override
    public GenerateVideosParameters.Builder config(GenerateVideosConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    GenerateVideosParameters.Builder config(Optional<GenerateVideosConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public GenerateVideosParameters build() {
      return new AutoValue_GenerateVideosParameters(
          this.model,
          this.prompt,
          this.image,
          this.video,
          this.source,
          this.config);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_EmbedContentConfig extends EmbedContentConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<String> taskType;

  private final Optional<String> title;

  private final Optional<Integer> outputDimensionality;

  private final Optional<String> mimeType;

  private final Optional<Boolean> autoTruncate;

  private AutoValue_EmbedContentConfig(
      Optional<HttpOptions> httpOptions,
      Optional<String> taskType,
      Optional<String> title,
      Optional<Integer> outputDimensionality,
      Optional<String> mimeType,
      Optional<Boolean> autoTruncate) {
    this.httpOptions = httpOptions;
    this.taskType = taskType;
    this.title = title;
    this.outputDimensionality = outputDimensionality;
    this.mimeType = mimeType;
    this.autoTruncate = autoTruncate;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("taskType")
  @Override
  public Optional<String> taskType() {
    return taskType;
  }

  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return title;
  }

  @JsonProperty("outputDimensionality")
  @Override
  public Optional<Integer> outputDimensionality() {
    return outputDimensionality;
  }

  @JsonProperty("mimeType")
  @Override
  public Optional<String> mimeType() {
    return mimeType;
  }

  @JsonProperty("autoTruncate")
  @Override
  public Optional<Boolean> autoTruncate() {
    return autoTruncate;
  }

  @Override
  public String toString() {
    return "EmbedContentConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "taskType=" + taskType + ", "
        + "title=" + title + ", "
        + "outputDimensionality=" + outputDimensionality + ", "
        + "mimeType=" + mimeType + ", "
        + "autoTruncate=" + autoTruncate
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof EmbedContentConfig) {
      EmbedContentConfig that = (EmbedContentConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.taskType.equals(that.taskType())
          && this.title.equals(that.title())
          && this.outputDimensionality.equals(that.outputDimensionality())
          && this.mimeType.equals(that.mimeType())
          && this.autoTruncate.equals(that.autoTruncate());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= taskType.hashCode();
    h$ *= 1000003;
    h$ ^= title.hashCode();
    h$ *= 1000003;
    h$ ^= outputDimensionality.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    h$ *= 1000003;
    h$ ^= autoTruncate.hashCode();
    return h$;
  }

  @Override
  public EmbedContentConfig.Builder toBuilder() {
    return new AutoValue_EmbedContentConfig.Builder(this);
  }

  static final class Builder extends EmbedContentConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<String> taskType = Optional.empty();
    private Optional<String> title = Optional.empty();
    private Optional<Integer> outputDimensionality = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    private Optional<Boolean> autoTruncate = Optional.empty();
    Builder() {
    }
    Builder(EmbedContentConfig source) {
      this.httpOptions = source.httpOptions();
      this.taskType = source.taskType();
      this.title = source.title();
      this.outputDimensionality = source.outputDimensionality();
      this.mimeType = source.mimeType();
      this.autoTruncate = source.autoTruncate();
    }
    @Override
    public EmbedContentConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    EmbedContentConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public EmbedContentConfig.Builder taskType(String taskType) {
      this.taskType = Optional.of(taskType);
      return this;
    }
    @Override
    EmbedContentConfig.Builder taskType(Optional<String> taskType) {
      if (taskType == null) {
        throw new NullPointerException("Null taskType");
      }
      this.taskType = taskType;
      return this;
    }
    @Override
    public EmbedContentConfig.Builder title(String title) {
      this.title = Optional.of(title);
      return this;
    }
    @Override
    EmbedContentConfig.Builder title(Optional<String> title) {
      if (title == null) {
        throw new NullPointerException("Null title");
      }
      this.title = title;
      return this;
    }
    @Override
    public EmbedContentConfig.Builder outputDimensionality(Integer outputDimensionality) {
      this.outputDimensionality = Optional.of(outputDimensionality);
      return this;
    }
    @Override
    EmbedContentConfig.Builder outputDimensionality(Optional<Integer> outputDimensionality) {
      if (outputDimensionality == null) {
        throw new NullPointerException("Null outputDimensionality");
      }
      this.outputDimensionality = outputDimensionality;
      return this;
    }
    @Override
    public EmbedContentConfig.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    EmbedContentConfig.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public EmbedContentConfig.Builder autoTruncate(boolean autoTruncate) {
      this.autoTruncate = Optional.of(autoTruncate);
      return this;
    }
    @Override
    EmbedContentConfig.Builder autoTruncate(Optional<Boolean> autoTruncate) {
      if (autoTruncate == null) {
        throw new NullPointerException("Null autoTruncate");
      }
      this.autoTruncate = autoTruncate;
      return this;
    }
    @Override
    public EmbedContentConfig build() {
      return new AutoValue_EmbedContentConfig(
          this.httpOptions,
          this.taskType,
          this.title,
          this.outputDimensionality,
          this.mimeType,
          this.autoTruncate);
    }
  }

}

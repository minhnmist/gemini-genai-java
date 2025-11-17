package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CachedContentUsageMetadata extends CachedContentUsageMetadata {

  private final Optional<Integer> audioDurationSeconds;

  private final Optional<Integer> imageCount;

  private final Optional<Integer> textCount;

  private final Optional<Integer> totalTokenCount;

  private final Optional<Integer> videoDurationSeconds;

  private AutoValue_CachedContentUsageMetadata(
      Optional<Integer> audioDurationSeconds,
      Optional<Integer> imageCount,
      Optional<Integer> textCount,
      Optional<Integer> totalTokenCount,
      Optional<Integer> videoDurationSeconds) {
    this.audioDurationSeconds = audioDurationSeconds;
    this.imageCount = imageCount;
    this.textCount = textCount;
    this.totalTokenCount = totalTokenCount;
    this.videoDurationSeconds = videoDurationSeconds;
  }

  @JsonProperty("audioDurationSeconds")
  @Override
  public Optional<Integer> audioDurationSeconds() {
    return audioDurationSeconds;
  }

  @JsonProperty("imageCount")
  @Override
  public Optional<Integer> imageCount() {
    return imageCount;
  }

  @JsonProperty("textCount")
  @Override
  public Optional<Integer> textCount() {
    return textCount;
  }

  @JsonProperty("totalTokenCount")
  @Override
  public Optional<Integer> totalTokenCount() {
    return totalTokenCount;
  }

  @JsonProperty("videoDurationSeconds")
  @Override
  public Optional<Integer> videoDurationSeconds() {
    return videoDurationSeconds;
  }

  @Override
  public String toString() {
    return "CachedContentUsageMetadata{"
        + "audioDurationSeconds=" + audioDurationSeconds + ", "
        + "imageCount=" + imageCount + ", "
        + "textCount=" + textCount + ", "
        + "totalTokenCount=" + totalTokenCount + ", "
        + "videoDurationSeconds=" + videoDurationSeconds
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CachedContentUsageMetadata) {
      CachedContentUsageMetadata that = (CachedContentUsageMetadata) o;
      return this.audioDurationSeconds.equals(that.audioDurationSeconds())
          && this.imageCount.equals(that.imageCount())
          && this.textCount.equals(that.textCount())
          && this.totalTokenCount.equals(that.totalTokenCount())
          && this.videoDurationSeconds.equals(that.videoDurationSeconds());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= audioDurationSeconds.hashCode();
    h$ *= 1000003;
    h$ ^= imageCount.hashCode();
    h$ *= 1000003;
    h$ ^= textCount.hashCode();
    h$ *= 1000003;
    h$ ^= totalTokenCount.hashCode();
    h$ *= 1000003;
    h$ ^= videoDurationSeconds.hashCode();
    return h$;
  }

  @Override
  public CachedContentUsageMetadata.Builder toBuilder() {
    return new AutoValue_CachedContentUsageMetadata.Builder(this);
  }

  static final class Builder extends CachedContentUsageMetadata.Builder {
    private Optional<Integer> audioDurationSeconds = Optional.empty();
    private Optional<Integer> imageCount = Optional.empty();
    private Optional<Integer> textCount = Optional.empty();
    private Optional<Integer> totalTokenCount = Optional.empty();
    private Optional<Integer> videoDurationSeconds = Optional.empty();
    Builder() {
    }
    Builder(CachedContentUsageMetadata source) {
      this.audioDurationSeconds = source.audioDurationSeconds();
      this.imageCount = source.imageCount();
      this.textCount = source.textCount();
      this.totalTokenCount = source.totalTokenCount();
      this.videoDurationSeconds = source.videoDurationSeconds();
    }
    @Override
    public CachedContentUsageMetadata.Builder audioDurationSeconds(Integer audioDurationSeconds) {
      this.audioDurationSeconds = Optional.of(audioDurationSeconds);
      return this;
    }
    @Override
    CachedContentUsageMetadata.Builder audioDurationSeconds(Optional<Integer> audioDurationSeconds) {
      if (audioDurationSeconds == null) {
        throw new NullPointerException("Null audioDurationSeconds");
      }
      this.audioDurationSeconds = audioDurationSeconds;
      return this;
    }
    @Override
    public CachedContentUsageMetadata.Builder imageCount(Integer imageCount) {
      this.imageCount = Optional.of(imageCount);
      return this;
    }
    @Override
    CachedContentUsageMetadata.Builder imageCount(Optional<Integer> imageCount) {
      if (imageCount == null) {
        throw new NullPointerException("Null imageCount");
      }
      this.imageCount = imageCount;
      return this;
    }
    @Override
    public CachedContentUsageMetadata.Builder textCount(Integer textCount) {
      this.textCount = Optional.of(textCount);
      return this;
    }
    @Override
    CachedContentUsageMetadata.Builder textCount(Optional<Integer> textCount) {
      if (textCount == null) {
        throw new NullPointerException("Null textCount");
      }
      this.textCount = textCount;
      return this;
    }
    @Override
    public CachedContentUsageMetadata.Builder totalTokenCount(Integer totalTokenCount) {
      this.totalTokenCount = Optional.of(totalTokenCount);
      return this;
    }
    @Override
    CachedContentUsageMetadata.Builder totalTokenCount(Optional<Integer> totalTokenCount) {
      if (totalTokenCount == null) {
        throw new NullPointerException("Null totalTokenCount");
      }
      this.totalTokenCount = totalTokenCount;
      return this;
    }
    @Override
    public CachedContentUsageMetadata.Builder videoDurationSeconds(Integer videoDurationSeconds) {
      this.videoDurationSeconds = Optional.of(videoDurationSeconds);
      return this;
    }
    @Override
    CachedContentUsageMetadata.Builder videoDurationSeconds(Optional<Integer> videoDurationSeconds) {
      if (videoDurationSeconds == null) {
        throw new NullPointerException("Null videoDurationSeconds");
      }
      this.videoDurationSeconds = videoDurationSeconds;
      return this;
    }
    @Override
    public CachedContentUsageMetadata build() {
      return new AutoValue_CachedContentUsageMetadata(
          this.audioDurationSeconds,
          this.imageCount,
          this.textCount,
          this.totalTokenCount,
          this.videoDurationSeconds);
    }
  }

}

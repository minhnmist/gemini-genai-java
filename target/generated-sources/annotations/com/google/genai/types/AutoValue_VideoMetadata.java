package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_VideoMetadata extends VideoMetadata {

  private final Optional<Duration> endOffset;

  private final Optional<Double> fps;

  private final Optional<Duration> startOffset;

  private AutoValue_VideoMetadata(
      Optional<Duration> endOffset,
      Optional<Double> fps,
      Optional<Duration> startOffset) {
    this.endOffset = endOffset;
    this.fps = fps;
    this.startOffset = startOffset;
  }

  @JsonProperty("endOffset")
  @Override
  public Optional<Duration> endOffset() {
    return endOffset;
  }

  @JsonProperty("fps")
  @Override
  public Optional<Double> fps() {
    return fps;
  }

  @JsonProperty("startOffset")
  @Override
  public Optional<Duration> startOffset() {
    return startOffset;
  }

  @Override
  public String toString() {
    return "VideoMetadata{"
        + "endOffset=" + endOffset + ", "
        + "fps=" + fps + ", "
        + "startOffset=" + startOffset
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VideoMetadata) {
      VideoMetadata that = (VideoMetadata) o;
      return this.endOffset.equals(that.endOffset())
          && this.fps.equals(that.fps())
          && this.startOffset.equals(that.startOffset());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= endOffset.hashCode();
    h$ *= 1000003;
    h$ ^= fps.hashCode();
    h$ *= 1000003;
    h$ ^= startOffset.hashCode();
    return h$;
  }

  @Override
  public VideoMetadata.Builder toBuilder() {
    return new AutoValue_VideoMetadata.Builder(this);
  }

  static final class Builder extends VideoMetadata.Builder {
    private Optional<Duration> endOffset = Optional.empty();
    private Optional<Double> fps = Optional.empty();
    private Optional<Duration> startOffset = Optional.empty();
    Builder() {
    }
    Builder(VideoMetadata source) {
      this.endOffset = source.endOffset();
      this.fps = source.fps();
      this.startOffset = source.startOffset();
    }
    @Override
    public VideoMetadata.Builder endOffset(Duration endOffset) {
      this.endOffset = Optional.of(endOffset);
      return this;
    }
    @Override
    VideoMetadata.Builder endOffset(Optional<Duration> endOffset) {
      if (endOffset == null) {
        throw new NullPointerException("Null endOffset");
      }
      this.endOffset = endOffset;
      return this;
    }
    @Override
    public VideoMetadata.Builder fps(Double fps) {
      this.fps = Optional.of(fps);
      return this;
    }
    @Override
    VideoMetadata.Builder fps(Optional<Double> fps) {
      if (fps == null) {
        throw new NullPointerException("Null fps");
      }
      this.fps = fps;
      return this;
    }
    @Override
    public VideoMetadata.Builder startOffset(Duration startOffset) {
      this.startOffset = Optional.of(startOffset);
      return this;
    }
    @Override
    VideoMetadata.Builder startOffset(Optional<Duration> startOffset) {
      if (startOffset == null) {
        throw new NullPointerException("Null startOffset");
      }
      this.startOffset = startOffset;
      return this;
    }
    @Override
    public VideoMetadata build() {
      return new AutoValue_VideoMetadata(
          this.endOffset,
          this.fps,
          this.startOffset);
    }
  }

}

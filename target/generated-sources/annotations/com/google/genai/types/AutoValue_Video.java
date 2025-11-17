package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Video extends Video {

  private final Optional<String> uri;

  private final Optional<byte[]> videoBytes;

  private final Optional<String> mimeType;

  private AutoValue_Video(
      Optional<String> uri,
      Optional<byte[]> videoBytes,
      Optional<String> mimeType) {
    this.uri = uri;
    this.videoBytes = videoBytes;
    this.mimeType = mimeType;
  }

  @JsonProperty("uri")
  @Override
  public Optional<String> uri() {
    return uri;
  }

  @JsonProperty("videoBytes")
  @Override
  public Optional<byte[]> videoBytes() {
    return videoBytes;
  }

  @JsonProperty("mimeType")
  @Override
  public Optional<String> mimeType() {
    return mimeType;
  }

  @Override
  public String toString() {
    return "Video{"
        + "uri=" + uri + ", "
        + "videoBytes=" + videoBytes + ", "
        + "mimeType=" + mimeType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Video) {
      Video that = (Video) o;
      return this.uri.equals(that.uri())
          && this.videoBytes.equals(that.videoBytes())
          && this.mimeType.equals(that.mimeType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= uri.hashCode();
    h$ *= 1000003;
    h$ ^= videoBytes.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    return h$;
  }

  @Override
  public Video.Builder toBuilder() {
    return new AutoValue_Video.Builder(this);
  }

  static final class Builder extends Video.Builder {
    private Optional<String> uri = Optional.empty();
    private Optional<byte[]> videoBytes = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    Builder() {
    }
    Builder(Video source) {
      this.uri = source.uri();
      this.videoBytes = source.videoBytes();
      this.mimeType = source.mimeType();
    }
    @Override
    public Video.Builder uri(String uri) {
      this.uri = Optional.of(uri);
      return this;
    }
    @Override
    Video.Builder uri(Optional<String> uri) {
      if (uri == null) {
        throw new NullPointerException("Null uri");
      }
      this.uri = uri;
      return this;
    }
    @Override
    public Video.Builder videoBytes(byte[] videoBytes) {
      this.videoBytes = Optional.of(videoBytes);
      return this;
    }
    @Override
    Video.Builder videoBytes(Optional<byte[]> videoBytes) {
      if (videoBytes == null) {
        throw new NullPointerException("Null videoBytes");
      }
      this.videoBytes = videoBytes;
      return this;
    }
    @Override
    public Video.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    Video.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public Video build() {
      return new AutoValue_Video(
          this.uri,
          this.videoBytes,
          this.mimeType);
    }
  }

}

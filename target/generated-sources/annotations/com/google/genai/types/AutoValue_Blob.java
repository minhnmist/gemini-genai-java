package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Blob extends Blob {

  private final Optional<byte[]> data;

  private final Optional<String> displayName;

  private final Optional<String> mimeType;

  private AutoValue_Blob(
      Optional<byte[]> data,
      Optional<String> displayName,
      Optional<String> mimeType) {
    this.data = data;
    this.displayName = displayName;
    this.mimeType = mimeType;
  }

  @JsonProperty("data")
  @Override
  public Optional<byte[]> data() {
    return data;
  }

  @JsonProperty("displayName")
  @Override
  public Optional<String> displayName() {
    return displayName;
  }

  @JsonProperty("mimeType")
  @Override
  public Optional<String> mimeType() {
    return mimeType;
  }

  @Override
  public String toString() {
    return "Blob{"
        + "data=" + data + ", "
        + "displayName=" + displayName + ", "
        + "mimeType=" + mimeType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Blob) {
      Blob that = (Blob) o;
      return this.data.equals(that.data())
          && this.displayName.equals(that.displayName())
          && this.mimeType.equals(that.mimeType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= data.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    return h$;
  }

  @Override
  public Blob.Builder toBuilder() {
    return new AutoValue_Blob.Builder(this);
  }

  static final class Builder extends Blob.Builder {
    private Optional<byte[]> data = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    Builder() {
    }
    Builder(Blob source) {
      this.data = source.data();
      this.displayName = source.displayName();
      this.mimeType = source.mimeType();
    }
    @Override
    public Blob.Builder data(byte[] data) {
      this.data = Optional.of(data);
      return this;
    }
    @Override
    Blob.Builder data(Optional<byte[]> data) {
      if (data == null) {
        throw new NullPointerException("Null data");
      }
      this.data = data;
      return this;
    }
    @Override
    public Blob.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    Blob.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public Blob.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    Blob.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public Blob build() {
      return new AutoValue_Blob(
          this.data,
          this.displayName,
          this.mimeType);
    }
  }

}

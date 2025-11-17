package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FunctionResponseBlob extends FunctionResponseBlob {

  private final Optional<String> mimeType;

  private final Optional<byte[]> data;

  private final Optional<String> displayName;

  private AutoValue_FunctionResponseBlob(
      Optional<String> mimeType,
      Optional<byte[]> data,
      Optional<String> displayName) {
    this.mimeType = mimeType;
    this.data = data;
    this.displayName = displayName;
  }

  @JsonProperty("mimeType")
  @Override
  public Optional<String> mimeType() {
    return mimeType;
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

  @Override
  public String toString() {
    return "FunctionResponseBlob{"
        + "mimeType=" + mimeType + ", "
        + "data=" + data + ", "
        + "displayName=" + displayName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FunctionResponseBlob) {
      FunctionResponseBlob that = (FunctionResponseBlob) o;
      return this.mimeType.equals(that.mimeType())
          && this.data.equals(that.data())
          && this.displayName.equals(that.displayName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    h$ *= 1000003;
    h$ ^= data.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    return h$;
  }

  @Override
  public FunctionResponseBlob.Builder toBuilder() {
    return new AutoValue_FunctionResponseBlob.Builder(this);
  }

  static final class Builder extends FunctionResponseBlob.Builder {
    private Optional<String> mimeType = Optional.empty();
    private Optional<byte[]> data = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    Builder() {
    }
    Builder(FunctionResponseBlob source) {
      this.mimeType = source.mimeType();
      this.data = source.data();
      this.displayName = source.displayName();
    }
    @Override
    public FunctionResponseBlob.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    FunctionResponseBlob.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public FunctionResponseBlob.Builder data(byte[] data) {
      this.data = Optional.of(data);
      return this;
    }
    @Override
    FunctionResponseBlob.Builder data(Optional<byte[]> data) {
      if (data == null) {
        throw new NullPointerException("Null data");
      }
      this.data = data;
      return this;
    }
    @Override
    public FunctionResponseBlob.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    FunctionResponseBlob.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public FunctionResponseBlob build() {
      return new AutoValue_FunctionResponseBlob(
          this.mimeType,
          this.data,
          this.displayName);
    }
  }

}

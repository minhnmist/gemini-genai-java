package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FunctionResponseFileData extends FunctionResponseFileData {

  private final Optional<String> fileUri;

  private final Optional<String> mimeType;

  private AutoValue_FunctionResponseFileData(
      Optional<String> fileUri,
      Optional<String> mimeType) {
    this.fileUri = fileUri;
    this.mimeType = mimeType;
  }

  @JsonProperty("fileUri")
  @Override
  public Optional<String> fileUri() {
    return fileUri;
  }

  @JsonProperty("mimeType")
  @Override
  public Optional<String> mimeType() {
    return mimeType;
  }

  @Override
  public String toString() {
    return "FunctionResponseFileData{"
        + "fileUri=" + fileUri + ", "
        + "mimeType=" + mimeType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FunctionResponseFileData) {
      FunctionResponseFileData that = (FunctionResponseFileData) o;
      return this.fileUri.equals(that.fileUri())
          && this.mimeType.equals(that.mimeType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= fileUri.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    return h$;
  }

  @Override
  public FunctionResponseFileData.Builder toBuilder() {
    return new AutoValue_FunctionResponseFileData.Builder(this);
  }

  static final class Builder extends FunctionResponseFileData.Builder {
    private Optional<String> fileUri = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    Builder() {
    }
    Builder(FunctionResponseFileData source) {
      this.fileUri = source.fileUri();
      this.mimeType = source.mimeType();
    }
    @Override
    public FunctionResponseFileData.Builder fileUri(String fileUri) {
      this.fileUri = Optional.of(fileUri);
      return this;
    }
    @Override
    FunctionResponseFileData.Builder fileUri(Optional<String> fileUri) {
      if (fileUri == null) {
        throw new NullPointerException("Null fileUri");
      }
      this.fileUri = fileUri;
      return this;
    }
    @Override
    public FunctionResponseFileData.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    FunctionResponseFileData.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public FunctionResponseFileData build() {
      return new AutoValue_FunctionResponseFileData(
          this.fileUri,
          this.mimeType);
    }
  }

}

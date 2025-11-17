package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FunctionResponsePart extends FunctionResponsePart {

  private final Optional<FunctionResponseBlob> inlineData;

  private final Optional<FunctionResponseFileData> fileData;

  private AutoValue_FunctionResponsePart(
      Optional<FunctionResponseBlob> inlineData,
      Optional<FunctionResponseFileData> fileData) {
    this.inlineData = inlineData;
    this.fileData = fileData;
  }

  @JsonProperty("inlineData")
  @Override
  public Optional<FunctionResponseBlob> inlineData() {
    return inlineData;
  }

  @JsonProperty("fileData")
  @Override
  public Optional<FunctionResponseFileData> fileData() {
    return fileData;
  }

  @Override
  public String toString() {
    return "FunctionResponsePart{"
        + "inlineData=" + inlineData + ", "
        + "fileData=" + fileData
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FunctionResponsePart) {
      FunctionResponsePart that = (FunctionResponsePart) o;
      return this.inlineData.equals(that.inlineData())
          && this.fileData.equals(that.fileData());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= inlineData.hashCode();
    h$ *= 1000003;
    h$ ^= fileData.hashCode();
    return h$;
  }

  @Override
  public FunctionResponsePart.Builder toBuilder() {
    return new AutoValue_FunctionResponsePart.Builder(this);
  }

  static final class Builder extends FunctionResponsePart.Builder {
    private Optional<FunctionResponseBlob> inlineData = Optional.empty();
    private Optional<FunctionResponseFileData> fileData = Optional.empty();
    Builder() {
    }
    Builder(FunctionResponsePart source) {
      this.inlineData = source.inlineData();
      this.fileData = source.fileData();
    }
    @Override
    public FunctionResponsePart.Builder inlineData(FunctionResponseBlob inlineData) {
      this.inlineData = Optional.of(inlineData);
      return this;
    }
    @Override
    FunctionResponsePart.Builder inlineData(Optional<FunctionResponseBlob> inlineData) {
      if (inlineData == null) {
        throw new NullPointerException("Null inlineData");
      }
      this.inlineData = inlineData;
      return this;
    }
    @Override
    public FunctionResponsePart.Builder fileData(FunctionResponseFileData fileData) {
      this.fileData = Optional.of(fileData);
      return this;
    }
    @Override
    FunctionResponsePart.Builder fileData(Optional<FunctionResponseFileData> fileData) {
      if (fileData == null) {
        throw new NullPointerException("Null fileData");
      }
      this.fileData = fileData;
      return this;
    }
    @Override
    public FunctionResponsePart build() {
      return new AutoValue_FunctionResponsePart(
          this.inlineData,
          this.fileData);
    }
  }

}

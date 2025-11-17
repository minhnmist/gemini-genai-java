package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FileData extends FileData {

  private final Optional<String> displayName;

  private final Optional<String> fileUri;

  private final Optional<String> mimeType;

  private AutoValue_FileData(
      Optional<String> displayName,
      Optional<String> fileUri,
      Optional<String> mimeType) {
    this.displayName = displayName;
    this.fileUri = fileUri;
    this.mimeType = mimeType;
  }

  @JsonProperty("displayName")
  @Override
  public Optional<String> displayName() {
    return displayName;
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
    return "FileData{"
        + "displayName=" + displayName + ", "
        + "fileUri=" + fileUri + ", "
        + "mimeType=" + mimeType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FileData) {
      FileData that = (FileData) o;
      return this.displayName.equals(that.displayName())
          && this.fileUri.equals(that.fileUri())
          && this.mimeType.equals(that.mimeType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    h$ *= 1000003;
    h$ ^= fileUri.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    return h$;
  }

  @Override
  public FileData.Builder toBuilder() {
    return new AutoValue_FileData.Builder(this);
  }

  static final class Builder extends FileData.Builder {
    private Optional<String> displayName = Optional.empty();
    private Optional<String> fileUri = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    Builder() {
    }
    Builder(FileData source) {
      this.displayName = source.displayName();
      this.fileUri = source.fileUri();
      this.mimeType = source.mimeType();
    }
    @Override
    public FileData.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    FileData.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public FileData.Builder fileUri(String fileUri) {
      this.fileUri = Optional.of(fileUri);
      return this;
    }
    @Override
    FileData.Builder fileUri(Optional<String> fileUri) {
      if (fileUri == null) {
        throw new NullPointerException("Null fileUri");
      }
      this.fileUri = fileUri;
      return this;
    }
    @Override
    public FileData.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    FileData.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public FileData build() {
      return new AutoValue_FileData(
          this.displayName,
          this.fileUri,
          this.mimeType);
    }
  }

}

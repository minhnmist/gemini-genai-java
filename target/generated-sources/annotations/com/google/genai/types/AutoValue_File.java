package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_File extends File {

  private final Optional<String> name;

  private final Optional<String> displayName;

  private final Optional<String> mimeType;

  private final Optional<Long> sizeBytes;

  private final Optional<Instant> createTime;

  private final Optional<Instant> expirationTime;

  private final Optional<Instant> updateTime;

  private final Optional<String> sha256Hash;

  private final Optional<String> uri;

  private final Optional<String> downloadUri;

  private final Optional<FileState> state;

  private final Optional<FileSource> source;

  private final Optional<Map<String, Object>> videoMetadata;

  private final Optional<FileStatus> error;

  private AutoValue_File(
      Optional<String> name,
      Optional<String> displayName,
      Optional<String> mimeType,
      Optional<Long> sizeBytes,
      Optional<Instant> createTime,
      Optional<Instant> expirationTime,
      Optional<Instant> updateTime,
      Optional<String> sha256Hash,
      Optional<String> uri,
      Optional<String> downloadUri,
      Optional<FileState> state,
      Optional<FileSource> source,
      Optional<Map<String, Object>> videoMetadata,
      Optional<FileStatus> error) {
    this.name = name;
    this.displayName = displayName;
    this.mimeType = mimeType;
    this.sizeBytes = sizeBytes;
    this.createTime = createTime;
    this.expirationTime = expirationTime;
    this.updateTime = updateTime;
    this.sha256Hash = sha256Hash;
    this.uri = uri;
    this.downloadUri = downloadUri;
    this.state = state;
    this.source = source;
    this.videoMetadata = videoMetadata;
    this.error = error;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
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

  @JsonProperty("sizeBytes")
  @Override
  public Optional<Long> sizeBytes() {
    return sizeBytes;
  }

  @JsonProperty("createTime")
  @Override
  public Optional<Instant> createTime() {
    return createTime;
  }

  @JsonProperty("expirationTime")
  @Override
  public Optional<Instant> expirationTime() {
    return expirationTime;
  }

  @JsonProperty("updateTime")
  @Override
  public Optional<Instant> updateTime() {
    return updateTime;
  }

  @JsonProperty("sha256Hash")
  @Override
  public Optional<String> sha256Hash() {
    return sha256Hash;
  }

  @JsonProperty("uri")
  @Override
  public Optional<String> uri() {
    return uri;
  }

  @JsonProperty("downloadUri")
  @Override
  public Optional<String> downloadUri() {
    return downloadUri;
  }

  @JsonProperty("state")
  @Override
  public Optional<FileState> state() {
    return state;
  }

  @JsonProperty("source")
  @Override
  public Optional<FileSource> source() {
    return source;
  }

  @JsonProperty("videoMetadata")
  @Override
  public Optional<Map<String, Object>> videoMetadata() {
    return videoMetadata;
  }

  @JsonProperty("error")
  @Override
  public Optional<FileStatus> error() {
    return error;
  }

  @Override
  public String toString() {
    return "File{"
        + "name=" + name + ", "
        + "displayName=" + displayName + ", "
        + "mimeType=" + mimeType + ", "
        + "sizeBytes=" + sizeBytes + ", "
        + "createTime=" + createTime + ", "
        + "expirationTime=" + expirationTime + ", "
        + "updateTime=" + updateTime + ", "
        + "sha256Hash=" + sha256Hash + ", "
        + "uri=" + uri + ", "
        + "downloadUri=" + downloadUri + ", "
        + "state=" + state + ", "
        + "source=" + source + ", "
        + "videoMetadata=" + videoMetadata + ", "
        + "error=" + error
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof File) {
      File that = (File) o;
      return this.name.equals(that.name())
          && this.displayName.equals(that.displayName())
          && this.mimeType.equals(that.mimeType())
          && this.sizeBytes.equals(that.sizeBytes())
          && this.createTime.equals(that.createTime())
          && this.expirationTime.equals(that.expirationTime())
          && this.updateTime.equals(that.updateTime())
          && this.sha256Hash.equals(that.sha256Hash())
          && this.uri.equals(that.uri())
          && this.downloadUri.equals(that.downloadUri())
          && this.state.equals(that.state())
          && this.source.equals(that.source())
          && this.videoMetadata.equals(that.videoMetadata())
          && this.error.equals(that.error());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    h$ *= 1000003;
    h$ ^= sizeBytes.hashCode();
    h$ *= 1000003;
    h$ ^= createTime.hashCode();
    h$ *= 1000003;
    h$ ^= expirationTime.hashCode();
    h$ *= 1000003;
    h$ ^= updateTime.hashCode();
    h$ *= 1000003;
    h$ ^= sha256Hash.hashCode();
    h$ *= 1000003;
    h$ ^= uri.hashCode();
    h$ *= 1000003;
    h$ ^= downloadUri.hashCode();
    h$ *= 1000003;
    h$ ^= state.hashCode();
    h$ *= 1000003;
    h$ ^= source.hashCode();
    h$ *= 1000003;
    h$ ^= videoMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= error.hashCode();
    return h$;
  }

  @Override
  public File.Builder toBuilder() {
    return new AutoValue_File.Builder(this);
  }

  static final class Builder extends File.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    private Optional<Long> sizeBytes = Optional.empty();
    private Optional<Instant> createTime = Optional.empty();
    private Optional<Instant> expirationTime = Optional.empty();
    private Optional<Instant> updateTime = Optional.empty();
    private Optional<String> sha256Hash = Optional.empty();
    private Optional<String> uri = Optional.empty();
    private Optional<String> downloadUri = Optional.empty();
    private Optional<FileState> state = Optional.empty();
    private Optional<FileSource> source = Optional.empty();
    private Optional<Map<String, Object>> videoMetadata = Optional.empty();
    private Optional<FileStatus> error = Optional.empty();
    Builder() {
    }
    Builder(File source) {
      this.name = source.name();
      this.displayName = source.displayName();
      this.mimeType = source.mimeType();
      this.sizeBytes = source.sizeBytes();
      this.createTime = source.createTime();
      this.expirationTime = source.expirationTime();
      this.updateTime = source.updateTime();
      this.sha256Hash = source.sha256Hash();
      this.uri = source.uri();
      this.downloadUri = source.downloadUri();
      this.state = source.state();
      this.source = source.source();
      this.videoMetadata = source.videoMetadata();
      this.error = source.error();
    }
    @Override
    public File.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    File.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public File.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    File.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public File.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    File.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public File.Builder sizeBytes(Long sizeBytes) {
      this.sizeBytes = Optional.of(sizeBytes);
      return this;
    }
    @Override
    File.Builder sizeBytes(Optional<Long> sizeBytes) {
      if (sizeBytes == null) {
        throw new NullPointerException("Null sizeBytes");
      }
      this.sizeBytes = sizeBytes;
      return this;
    }
    @Override
    public File.Builder createTime(Instant createTime) {
      this.createTime = Optional.of(createTime);
      return this;
    }
    @Override
    File.Builder createTime(Optional<Instant> createTime) {
      if (createTime == null) {
        throw new NullPointerException("Null createTime");
      }
      this.createTime = createTime;
      return this;
    }
    @Override
    public File.Builder expirationTime(Instant expirationTime) {
      this.expirationTime = Optional.of(expirationTime);
      return this;
    }
    @Override
    File.Builder expirationTime(Optional<Instant> expirationTime) {
      if (expirationTime == null) {
        throw new NullPointerException("Null expirationTime");
      }
      this.expirationTime = expirationTime;
      return this;
    }
    @Override
    public File.Builder updateTime(Instant updateTime) {
      this.updateTime = Optional.of(updateTime);
      return this;
    }
    @Override
    File.Builder updateTime(Optional<Instant> updateTime) {
      if (updateTime == null) {
        throw new NullPointerException("Null updateTime");
      }
      this.updateTime = updateTime;
      return this;
    }
    @Override
    public File.Builder sha256Hash(String sha256Hash) {
      this.sha256Hash = Optional.of(sha256Hash);
      return this;
    }
    @Override
    File.Builder sha256Hash(Optional<String> sha256Hash) {
      if (sha256Hash == null) {
        throw new NullPointerException("Null sha256Hash");
      }
      this.sha256Hash = sha256Hash;
      return this;
    }
    @Override
    public File.Builder uri(String uri) {
      this.uri = Optional.of(uri);
      return this;
    }
    @Override
    File.Builder uri(Optional<String> uri) {
      if (uri == null) {
        throw new NullPointerException("Null uri");
      }
      this.uri = uri;
      return this;
    }
    @Override
    public File.Builder downloadUri(String downloadUri) {
      this.downloadUri = Optional.of(downloadUri);
      return this;
    }
    @Override
    File.Builder downloadUri(Optional<String> downloadUri) {
      if (downloadUri == null) {
        throw new NullPointerException("Null downloadUri");
      }
      this.downloadUri = downloadUri;
      return this;
    }
    @Override
    public File.Builder state(FileState state) {
      this.state = Optional.of(state);
      return this;
    }
    @Override
    File.Builder state(Optional<FileState> state) {
      if (state == null) {
        throw new NullPointerException("Null state");
      }
      this.state = state;
      return this;
    }
    @Override
    public File.Builder source(FileSource source) {
      this.source = Optional.of(source);
      return this;
    }
    @Override
    File.Builder source(Optional<FileSource> source) {
      if (source == null) {
        throw new NullPointerException("Null source");
      }
      this.source = source;
      return this;
    }
    @Override
    public File.Builder videoMetadata(Map<String, Object> videoMetadata) {
      this.videoMetadata = Optional.of(videoMetadata);
      return this;
    }
    @Override
    File.Builder videoMetadata(Optional<Map<String, Object>> videoMetadata) {
      if (videoMetadata == null) {
        throw new NullPointerException("Null videoMetadata");
      }
      this.videoMetadata = videoMetadata;
      return this;
    }
    @Override
    public File.Builder error(FileStatus error) {
      this.error = Optional.of(error);
      return this;
    }
    @Override
    File.Builder error(Optional<FileStatus> error) {
      if (error == null) {
        throw new NullPointerException("Null error");
      }
      this.error = error;
      return this;
    }
    @Override
    public File build() {
      return new AutoValue_File(
          this.name,
          this.displayName,
          this.mimeType,
          this.sizeBytes,
          this.createTime,
          this.expirationTime,
          this.updateTime,
          this.sha256Hash,
          this.uri,
          this.downloadUri,
          this.state,
          this.source,
          this.videoMetadata,
          this.error);
    }
  }

}

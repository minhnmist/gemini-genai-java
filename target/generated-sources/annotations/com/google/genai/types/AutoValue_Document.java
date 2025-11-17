package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Document extends Document {

  private final Optional<String> name;

  private final Optional<String> displayName;

  private final Optional<DocumentState> state;

  private final Optional<Long> sizeBytes;

  private final Optional<String> mimeType;

  private final Optional<Instant> createTime;

  private final Optional<List<CustomMetadata>> customMetadata;

  private final Optional<Instant> updateTime;

  private AutoValue_Document(
      Optional<String> name,
      Optional<String> displayName,
      Optional<DocumentState> state,
      Optional<Long> sizeBytes,
      Optional<String> mimeType,
      Optional<Instant> createTime,
      Optional<List<CustomMetadata>> customMetadata,
      Optional<Instant> updateTime) {
    this.name = name;
    this.displayName = displayName;
    this.state = state;
    this.sizeBytes = sizeBytes;
    this.mimeType = mimeType;
    this.createTime = createTime;
    this.customMetadata = customMetadata;
    this.updateTime = updateTime;
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

  @JsonProperty("state")
  @Override
  public Optional<DocumentState> state() {
    return state;
  }

  @JsonProperty("sizeBytes")
  @Override
  public Optional<Long> sizeBytes() {
    return sizeBytes;
  }

  @JsonProperty("mimeType")
  @Override
  public Optional<String> mimeType() {
    return mimeType;
  }

  @JsonProperty("createTime")
  @Override
  public Optional<Instant> createTime() {
    return createTime;
  }

  @JsonProperty("customMetadata")
  @Override
  public Optional<List<CustomMetadata>> customMetadata() {
    return customMetadata;
  }

  @JsonProperty("updateTime")
  @Override
  public Optional<Instant> updateTime() {
    return updateTime;
  }

  @Override
  public String toString() {
    return "Document{"
        + "name=" + name + ", "
        + "displayName=" + displayName + ", "
        + "state=" + state + ", "
        + "sizeBytes=" + sizeBytes + ", "
        + "mimeType=" + mimeType + ", "
        + "createTime=" + createTime + ", "
        + "customMetadata=" + customMetadata + ", "
        + "updateTime=" + updateTime
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Document) {
      Document that = (Document) o;
      return this.name.equals(that.name())
          && this.displayName.equals(that.displayName())
          && this.state.equals(that.state())
          && this.sizeBytes.equals(that.sizeBytes())
          && this.mimeType.equals(that.mimeType())
          && this.createTime.equals(that.createTime())
          && this.customMetadata.equals(that.customMetadata())
          && this.updateTime.equals(that.updateTime());
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
    h$ ^= state.hashCode();
    h$ *= 1000003;
    h$ ^= sizeBytes.hashCode();
    h$ *= 1000003;
    h$ ^= mimeType.hashCode();
    h$ *= 1000003;
    h$ ^= createTime.hashCode();
    h$ *= 1000003;
    h$ ^= customMetadata.hashCode();
    h$ *= 1000003;
    h$ ^= updateTime.hashCode();
    return h$;
  }

  @Override
  public Document.Builder toBuilder() {
    return new AutoValue_Document.Builder(this);
  }

  static final class Builder extends Document.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<DocumentState> state = Optional.empty();
    private Optional<Long> sizeBytes = Optional.empty();
    private Optional<String> mimeType = Optional.empty();
    private Optional<Instant> createTime = Optional.empty();
    private Optional<List<CustomMetadata>> customMetadata = Optional.empty();
    private Optional<Instant> updateTime = Optional.empty();
    Builder() {
    }
    Builder(Document source) {
      this.name = source.name();
      this.displayName = source.displayName();
      this.state = source.state();
      this.sizeBytes = source.sizeBytes();
      this.mimeType = source.mimeType();
      this.createTime = source.createTime();
      this.customMetadata = source.customMetadata();
      this.updateTime = source.updateTime();
    }
    @Override
    public Document.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    Document.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public Document.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    Document.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public Document.Builder state(DocumentState state) {
      this.state = Optional.of(state);
      return this;
    }
    @Override
    Document.Builder state(Optional<DocumentState> state) {
      if (state == null) {
        throw new NullPointerException("Null state");
      }
      this.state = state;
      return this;
    }
    @Override
    public Document.Builder sizeBytes(Long sizeBytes) {
      this.sizeBytes = Optional.of(sizeBytes);
      return this;
    }
    @Override
    Document.Builder sizeBytes(Optional<Long> sizeBytes) {
      if (sizeBytes == null) {
        throw new NullPointerException("Null sizeBytes");
      }
      this.sizeBytes = sizeBytes;
      return this;
    }
    @Override
    public Document.Builder mimeType(String mimeType) {
      this.mimeType = Optional.of(mimeType);
      return this;
    }
    @Override
    Document.Builder mimeType(Optional<String> mimeType) {
      if (mimeType == null) {
        throw new NullPointerException("Null mimeType");
      }
      this.mimeType = mimeType;
      return this;
    }
    @Override
    public Document.Builder createTime(Instant createTime) {
      this.createTime = Optional.of(createTime);
      return this;
    }
    @Override
    Document.Builder createTime(Optional<Instant> createTime) {
      if (createTime == null) {
        throw new NullPointerException("Null createTime");
      }
      this.createTime = createTime;
      return this;
    }
    @Override
    public Document.Builder customMetadata(List<CustomMetadata> customMetadata) {
      this.customMetadata = Optional.of(customMetadata);
      return this;
    }
    @Override
    Document.Builder customMetadata(Optional<List<CustomMetadata>> customMetadata) {
      if (customMetadata == null) {
        throw new NullPointerException("Null customMetadata");
      }
      this.customMetadata = customMetadata;
      return this;
    }
    @Override
    public Document.Builder updateTime(Instant updateTime) {
      this.updateTime = Optional.of(updateTime);
      return this;
    }
    @Override
    Document.Builder updateTime(Optional<Instant> updateTime) {
      if (updateTime == null) {
        throw new NullPointerException("Null updateTime");
      }
      this.updateTime = updateTime;
      return this;
    }
    @Override
    public Document build() {
      return new AutoValue_Document(
          this.name,
          this.displayName,
          this.state,
          this.sizeBytes,
          this.mimeType,
          this.createTime,
          this.customMetadata,
          this.updateTime);
    }
  }

}

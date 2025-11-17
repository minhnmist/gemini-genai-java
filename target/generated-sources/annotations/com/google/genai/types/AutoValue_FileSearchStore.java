package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FileSearchStore extends FileSearchStore {

  private final Optional<String> name;

  private final Optional<String> displayName;

  private final Optional<Instant> createTime;

  private final Optional<Instant> updateTime;

  private final Optional<Long> activeDocumentsCount;

  private final Optional<Long> pendingDocumentsCount;

  private final Optional<Long> failedDocumentsCount;

  private final Optional<Long> sizeBytes;

  private AutoValue_FileSearchStore(
      Optional<String> name,
      Optional<String> displayName,
      Optional<Instant> createTime,
      Optional<Instant> updateTime,
      Optional<Long> activeDocumentsCount,
      Optional<Long> pendingDocumentsCount,
      Optional<Long> failedDocumentsCount,
      Optional<Long> sizeBytes) {
    this.name = name;
    this.displayName = displayName;
    this.createTime = createTime;
    this.updateTime = updateTime;
    this.activeDocumentsCount = activeDocumentsCount;
    this.pendingDocumentsCount = pendingDocumentsCount;
    this.failedDocumentsCount = failedDocumentsCount;
    this.sizeBytes = sizeBytes;
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

  @JsonProperty("createTime")
  @Override
  public Optional<Instant> createTime() {
    return createTime;
  }

  @JsonProperty("updateTime")
  @Override
  public Optional<Instant> updateTime() {
    return updateTime;
  }

  @JsonProperty("activeDocumentsCount")
  @Override
  public Optional<Long> activeDocumentsCount() {
    return activeDocumentsCount;
  }

  @JsonProperty("pendingDocumentsCount")
  @Override
  public Optional<Long> pendingDocumentsCount() {
    return pendingDocumentsCount;
  }

  @JsonProperty("failedDocumentsCount")
  @Override
  public Optional<Long> failedDocumentsCount() {
    return failedDocumentsCount;
  }

  @JsonProperty("sizeBytes")
  @Override
  public Optional<Long> sizeBytes() {
    return sizeBytes;
  }

  @Override
  public String toString() {
    return "FileSearchStore{"
        + "name=" + name + ", "
        + "displayName=" + displayName + ", "
        + "createTime=" + createTime + ", "
        + "updateTime=" + updateTime + ", "
        + "activeDocumentsCount=" + activeDocumentsCount + ", "
        + "pendingDocumentsCount=" + pendingDocumentsCount + ", "
        + "failedDocumentsCount=" + failedDocumentsCount + ", "
        + "sizeBytes=" + sizeBytes
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FileSearchStore) {
      FileSearchStore that = (FileSearchStore) o;
      return this.name.equals(that.name())
          && this.displayName.equals(that.displayName())
          && this.createTime.equals(that.createTime())
          && this.updateTime.equals(that.updateTime())
          && this.activeDocumentsCount.equals(that.activeDocumentsCount())
          && this.pendingDocumentsCount.equals(that.pendingDocumentsCount())
          && this.failedDocumentsCount.equals(that.failedDocumentsCount())
          && this.sizeBytes.equals(that.sizeBytes());
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
    h$ ^= createTime.hashCode();
    h$ *= 1000003;
    h$ ^= updateTime.hashCode();
    h$ *= 1000003;
    h$ ^= activeDocumentsCount.hashCode();
    h$ *= 1000003;
    h$ ^= pendingDocumentsCount.hashCode();
    h$ *= 1000003;
    h$ ^= failedDocumentsCount.hashCode();
    h$ *= 1000003;
    h$ ^= sizeBytes.hashCode();
    return h$;
  }

  @Override
  public FileSearchStore.Builder toBuilder() {
    return new AutoValue_FileSearchStore.Builder(this);
  }

  static final class Builder extends FileSearchStore.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<Instant> createTime = Optional.empty();
    private Optional<Instant> updateTime = Optional.empty();
    private Optional<Long> activeDocumentsCount = Optional.empty();
    private Optional<Long> pendingDocumentsCount = Optional.empty();
    private Optional<Long> failedDocumentsCount = Optional.empty();
    private Optional<Long> sizeBytes = Optional.empty();
    Builder() {
    }
    Builder(FileSearchStore source) {
      this.name = source.name();
      this.displayName = source.displayName();
      this.createTime = source.createTime();
      this.updateTime = source.updateTime();
      this.activeDocumentsCount = source.activeDocumentsCount();
      this.pendingDocumentsCount = source.pendingDocumentsCount();
      this.failedDocumentsCount = source.failedDocumentsCount();
      this.sizeBytes = source.sizeBytes();
    }
    @Override
    public FileSearchStore.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    FileSearchStore.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public FileSearchStore.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    FileSearchStore.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public FileSearchStore.Builder createTime(Instant createTime) {
      this.createTime = Optional.of(createTime);
      return this;
    }
    @Override
    FileSearchStore.Builder createTime(Optional<Instant> createTime) {
      if (createTime == null) {
        throw new NullPointerException("Null createTime");
      }
      this.createTime = createTime;
      return this;
    }
    @Override
    public FileSearchStore.Builder updateTime(Instant updateTime) {
      this.updateTime = Optional.of(updateTime);
      return this;
    }
    @Override
    FileSearchStore.Builder updateTime(Optional<Instant> updateTime) {
      if (updateTime == null) {
        throw new NullPointerException("Null updateTime");
      }
      this.updateTime = updateTime;
      return this;
    }
    @Override
    public FileSearchStore.Builder activeDocumentsCount(Long activeDocumentsCount) {
      this.activeDocumentsCount = Optional.of(activeDocumentsCount);
      return this;
    }
    @Override
    FileSearchStore.Builder activeDocumentsCount(Optional<Long> activeDocumentsCount) {
      if (activeDocumentsCount == null) {
        throw new NullPointerException("Null activeDocumentsCount");
      }
      this.activeDocumentsCount = activeDocumentsCount;
      return this;
    }
    @Override
    public FileSearchStore.Builder pendingDocumentsCount(Long pendingDocumentsCount) {
      this.pendingDocumentsCount = Optional.of(pendingDocumentsCount);
      return this;
    }
    @Override
    FileSearchStore.Builder pendingDocumentsCount(Optional<Long> pendingDocumentsCount) {
      if (pendingDocumentsCount == null) {
        throw new NullPointerException("Null pendingDocumentsCount");
      }
      this.pendingDocumentsCount = pendingDocumentsCount;
      return this;
    }
    @Override
    public FileSearchStore.Builder failedDocumentsCount(Long failedDocumentsCount) {
      this.failedDocumentsCount = Optional.of(failedDocumentsCount);
      return this;
    }
    @Override
    FileSearchStore.Builder failedDocumentsCount(Optional<Long> failedDocumentsCount) {
      if (failedDocumentsCount == null) {
        throw new NullPointerException("Null failedDocumentsCount");
      }
      this.failedDocumentsCount = failedDocumentsCount;
      return this;
    }
    @Override
    public FileSearchStore.Builder sizeBytes(Long sizeBytes) {
      this.sizeBytes = Optional.of(sizeBytes);
      return this;
    }
    @Override
    FileSearchStore.Builder sizeBytes(Optional<Long> sizeBytes) {
      if (sizeBytes == null) {
        throw new NullPointerException("Null sizeBytes");
      }
      this.sizeBytes = sizeBytes;
      return this;
    }
    @Override
    public FileSearchStore build() {
      return new AutoValue_FileSearchStore(
          this.name,
          this.displayName,
          this.createTime,
          this.updateTime,
          this.activeDocumentsCount,
          this.pendingDocumentsCount,
          this.failedDocumentsCount,
          this.sizeBytes);
    }
  }

}

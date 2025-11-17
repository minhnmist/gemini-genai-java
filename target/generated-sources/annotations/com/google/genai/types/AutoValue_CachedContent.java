package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CachedContent extends CachedContent {

  private final Optional<String> name;

  private final Optional<String> displayName;

  private final Optional<String> model;

  private final Optional<Instant> createTime;

  private final Optional<Instant> updateTime;

  private final Optional<Instant> expireTime;

  private final Optional<CachedContentUsageMetadata> usageMetadata;

  private AutoValue_CachedContent(
      Optional<String> name,
      Optional<String> displayName,
      Optional<String> model,
      Optional<Instant> createTime,
      Optional<Instant> updateTime,
      Optional<Instant> expireTime,
      Optional<CachedContentUsageMetadata> usageMetadata) {
    this.name = name;
    this.displayName = displayName;
    this.model = model;
    this.createTime = createTime;
    this.updateTime = updateTime;
    this.expireTime = expireTime;
    this.usageMetadata = usageMetadata;
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

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
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

  @JsonProperty("expireTime")
  @Override
  public Optional<Instant> expireTime() {
    return expireTime;
  }

  @JsonProperty("usageMetadata")
  @Override
  public Optional<CachedContentUsageMetadata> usageMetadata() {
    return usageMetadata;
  }

  @Override
  public String toString() {
    return "CachedContent{"
        + "name=" + name + ", "
        + "displayName=" + displayName + ", "
        + "model=" + model + ", "
        + "createTime=" + createTime + ", "
        + "updateTime=" + updateTime + ", "
        + "expireTime=" + expireTime + ", "
        + "usageMetadata=" + usageMetadata
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CachedContent) {
      CachedContent that = (CachedContent) o;
      return this.name.equals(that.name())
          && this.displayName.equals(that.displayName())
          && this.model.equals(that.model())
          && this.createTime.equals(that.createTime())
          && this.updateTime.equals(that.updateTime())
          && this.expireTime.equals(that.expireTime())
          && this.usageMetadata.equals(that.usageMetadata());
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
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= createTime.hashCode();
    h$ *= 1000003;
    h$ ^= updateTime.hashCode();
    h$ *= 1000003;
    h$ ^= expireTime.hashCode();
    h$ *= 1000003;
    h$ ^= usageMetadata.hashCode();
    return h$;
  }

  @Override
  public CachedContent.Builder toBuilder() {
    return new AutoValue_CachedContent.Builder(this);
  }

  static final class Builder extends CachedContent.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<String> model = Optional.empty();
    private Optional<Instant> createTime = Optional.empty();
    private Optional<Instant> updateTime = Optional.empty();
    private Optional<Instant> expireTime = Optional.empty();
    private Optional<CachedContentUsageMetadata> usageMetadata = Optional.empty();
    Builder() {
    }
    Builder(CachedContent source) {
      this.name = source.name();
      this.displayName = source.displayName();
      this.model = source.model();
      this.createTime = source.createTime();
      this.updateTime = source.updateTime();
      this.expireTime = source.expireTime();
      this.usageMetadata = source.usageMetadata();
    }
    @Override
    public CachedContent.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    CachedContent.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public CachedContent.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    CachedContent.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public CachedContent.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    CachedContent.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public CachedContent.Builder createTime(Instant createTime) {
      this.createTime = Optional.of(createTime);
      return this;
    }
    @Override
    CachedContent.Builder createTime(Optional<Instant> createTime) {
      if (createTime == null) {
        throw new NullPointerException("Null createTime");
      }
      this.createTime = createTime;
      return this;
    }
    @Override
    public CachedContent.Builder updateTime(Instant updateTime) {
      this.updateTime = Optional.of(updateTime);
      return this;
    }
    @Override
    CachedContent.Builder updateTime(Optional<Instant> updateTime) {
      if (updateTime == null) {
        throw new NullPointerException("Null updateTime");
      }
      this.updateTime = updateTime;
      return this;
    }
    @Override
    public CachedContent.Builder expireTime(Instant expireTime) {
      this.expireTime = Optional.of(expireTime);
      return this;
    }
    @Override
    CachedContent.Builder expireTime(Optional<Instant> expireTime) {
      if (expireTime == null) {
        throw new NullPointerException("Null expireTime");
      }
      this.expireTime = expireTime;
      return this;
    }
    @Override
    public CachedContent.Builder usageMetadata(CachedContentUsageMetadata usageMetadata) {
      this.usageMetadata = Optional.of(usageMetadata);
      return this;
    }
    @Override
    CachedContent.Builder usageMetadata(Optional<CachedContentUsageMetadata> usageMetadata) {
      if (usageMetadata == null) {
        throw new NullPointerException("Null usageMetadata");
      }
      this.usageMetadata = usageMetadata;
      return this;
    }
    @Override
    public CachedContent build() {
      return new AutoValue_CachedContent(
          this.name,
          this.displayName,
          this.model,
          this.createTime,
          this.updateTime,
          this.expireTime,
          this.usageMetadata);
    }
  }

}

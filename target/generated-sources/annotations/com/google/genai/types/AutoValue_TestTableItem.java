package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TestTableItem extends TestTableItem {

  private final Optional<String> name;

  private final Optional<Map<String, Object>> parameters;

  private final Optional<String> exceptionIfMldev;

  private final Optional<String> exceptionIfVertex;

  private final Optional<String> overrideReplayId;

  private final Optional<Boolean> hasUnion;

  private final Optional<String> skipInApiMode;

  private final Optional<List<String>> ignoreKeys;

  private AutoValue_TestTableItem(
      Optional<String> name,
      Optional<Map<String, Object>> parameters,
      Optional<String> exceptionIfMldev,
      Optional<String> exceptionIfVertex,
      Optional<String> overrideReplayId,
      Optional<Boolean> hasUnion,
      Optional<String> skipInApiMode,
      Optional<List<String>> ignoreKeys) {
    this.name = name;
    this.parameters = parameters;
    this.exceptionIfMldev = exceptionIfMldev;
    this.exceptionIfVertex = exceptionIfVertex;
    this.overrideReplayId = overrideReplayId;
    this.hasUnion = hasUnion;
    this.skipInApiMode = skipInApiMode;
    this.ignoreKeys = ignoreKeys;
  }

  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return name;
  }

  @JsonProperty("parameters")
  @Override
  public Optional<Map<String, Object>> parameters() {
    return parameters;
  }

  @JsonProperty("exceptionIfMldev")
  @Override
  public Optional<String> exceptionIfMldev() {
    return exceptionIfMldev;
  }

  @JsonProperty("exceptionIfVertex")
  @Override
  public Optional<String> exceptionIfVertex() {
    return exceptionIfVertex;
  }

  @JsonProperty("overrideReplayId")
  @Override
  public Optional<String> overrideReplayId() {
    return overrideReplayId;
  }

  @JsonProperty("hasUnion")
  @Override
  public Optional<Boolean> hasUnion() {
    return hasUnion;
  }

  @JsonProperty("skipInApiMode")
  @Override
  public Optional<String> skipInApiMode() {
    return skipInApiMode;
  }

  @JsonProperty("ignoreKeys")
  @Override
  public Optional<List<String>> ignoreKeys() {
    return ignoreKeys;
  }

  @Override
  public String toString() {
    return "TestTableItem{"
        + "name=" + name + ", "
        + "parameters=" + parameters + ", "
        + "exceptionIfMldev=" + exceptionIfMldev + ", "
        + "exceptionIfVertex=" + exceptionIfVertex + ", "
        + "overrideReplayId=" + overrideReplayId + ", "
        + "hasUnion=" + hasUnion + ", "
        + "skipInApiMode=" + skipInApiMode + ", "
        + "ignoreKeys=" + ignoreKeys
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TestTableItem) {
      TestTableItem that = (TestTableItem) o;
      return this.name.equals(that.name())
          && this.parameters.equals(that.parameters())
          && this.exceptionIfMldev.equals(that.exceptionIfMldev())
          && this.exceptionIfVertex.equals(that.exceptionIfVertex())
          && this.overrideReplayId.equals(that.overrideReplayId())
          && this.hasUnion.equals(that.hasUnion())
          && this.skipInApiMode.equals(that.skipInApiMode())
          && this.ignoreKeys.equals(that.ignoreKeys());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= parameters.hashCode();
    h$ *= 1000003;
    h$ ^= exceptionIfMldev.hashCode();
    h$ *= 1000003;
    h$ ^= exceptionIfVertex.hashCode();
    h$ *= 1000003;
    h$ ^= overrideReplayId.hashCode();
    h$ *= 1000003;
    h$ ^= hasUnion.hashCode();
    h$ *= 1000003;
    h$ ^= skipInApiMode.hashCode();
    h$ *= 1000003;
    h$ ^= ignoreKeys.hashCode();
    return h$;
  }

  @Override
  public TestTableItem.Builder toBuilder() {
    return new AutoValue_TestTableItem.Builder(this);
  }

  static final class Builder extends TestTableItem.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<Map<String, Object>> parameters = Optional.empty();
    private Optional<String> exceptionIfMldev = Optional.empty();
    private Optional<String> exceptionIfVertex = Optional.empty();
    private Optional<String> overrideReplayId = Optional.empty();
    private Optional<Boolean> hasUnion = Optional.empty();
    private Optional<String> skipInApiMode = Optional.empty();
    private Optional<List<String>> ignoreKeys = Optional.empty();
    Builder() {
    }
    Builder(TestTableItem source) {
      this.name = source.name();
      this.parameters = source.parameters();
      this.exceptionIfMldev = source.exceptionIfMldev();
      this.exceptionIfVertex = source.exceptionIfVertex();
      this.overrideReplayId = source.overrideReplayId();
      this.hasUnion = source.hasUnion();
      this.skipInApiMode = source.skipInApiMode();
      this.ignoreKeys = source.ignoreKeys();
    }
    @Override
    public TestTableItem.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    TestTableItem.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public TestTableItem.Builder parameters(Map<String, Object> parameters) {
      this.parameters = Optional.of(parameters);
      return this;
    }
    @Override
    TestTableItem.Builder parameters(Optional<Map<String, Object>> parameters) {
      if (parameters == null) {
        throw new NullPointerException("Null parameters");
      }
      this.parameters = parameters;
      return this;
    }
    @Override
    public TestTableItem.Builder exceptionIfMldev(String exceptionIfMldev) {
      this.exceptionIfMldev = Optional.of(exceptionIfMldev);
      return this;
    }
    @Override
    TestTableItem.Builder exceptionIfMldev(Optional<String> exceptionIfMldev) {
      if (exceptionIfMldev == null) {
        throw new NullPointerException("Null exceptionIfMldev");
      }
      this.exceptionIfMldev = exceptionIfMldev;
      return this;
    }
    @Override
    public TestTableItem.Builder exceptionIfVertex(String exceptionIfVertex) {
      this.exceptionIfVertex = Optional.of(exceptionIfVertex);
      return this;
    }
    @Override
    TestTableItem.Builder exceptionIfVertex(Optional<String> exceptionIfVertex) {
      if (exceptionIfVertex == null) {
        throw new NullPointerException("Null exceptionIfVertex");
      }
      this.exceptionIfVertex = exceptionIfVertex;
      return this;
    }
    @Override
    public TestTableItem.Builder overrideReplayId(String overrideReplayId) {
      this.overrideReplayId = Optional.of(overrideReplayId);
      return this;
    }
    @Override
    TestTableItem.Builder overrideReplayId(Optional<String> overrideReplayId) {
      if (overrideReplayId == null) {
        throw new NullPointerException("Null overrideReplayId");
      }
      this.overrideReplayId = overrideReplayId;
      return this;
    }
    @Override
    public TestTableItem.Builder hasUnion(boolean hasUnion) {
      this.hasUnion = Optional.of(hasUnion);
      return this;
    }
    @Override
    TestTableItem.Builder hasUnion(Optional<Boolean> hasUnion) {
      if (hasUnion == null) {
        throw new NullPointerException("Null hasUnion");
      }
      this.hasUnion = hasUnion;
      return this;
    }
    @Override
    public TestTableItem.Builder skipInApiMode(String skipInApiMode) {
      this.skipInApiMode = Optional.of(skipInApiMode);
      return this;
    }
    @Override
    TestTableItem.Builder skipInApiMode(Optional<String> skipInApiMode) {
      if (skipInApiMode == null) {
        throw new NullPointerException("Null skipInApiMode");
      }
      this.skipInApiMode = skipInApiMode;
      return this;
    }
    @Override
    public TestTableItem.Builder ignoreKeys(List<String> ignoreKeys) {
      this.ignoreKeys = Optional.of(ignoreKeys);
      return this;
    }
    @Override
    TestTableItem.Builder ignoreKeys(Optional<List<String>> ignoreKeys) {
      if (ignoreKeys == null) {
        throw new NullPointerException("Null ignoreKeys");
      }
      this.ignoreKeys = ignoreKeys;
      return this;
    }
    @Override
    public TestTableItem build() {
      return new AutoValue_TestTableItem(
          this.name,
          this.parameters,
          this.exceptionIfMldev,
          this.exceptionIfVertex,
          this.overrideReplayId,
          this.hasUnion,
          this.skipInApiMode,
          this.ignoreKeys);
    }
  }

}

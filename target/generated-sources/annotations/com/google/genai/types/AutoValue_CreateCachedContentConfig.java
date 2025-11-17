package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CreateCachedContentConfig extends CreateCachedContentConfig {

  private final Optional<HttpOptions> httpOptions;

  private final Optional<Duration> ttl;

  private final Optional<Instant> expireTime;

  private final Optional<String> displayName;

  private final Optional<List<Content>> contents;

  private final Optional<Content> systemInstruction;

  private final Optional<List<Tool>> tools;

  private final Optional<ToolConfig> toolConfig;

  private final Optional<String> kmsKeyName;

  private AutoValue_CreateCachedContentConfig(
      Optional<HttpOptions> httpOptions,
      Optional<Duration> ttl,
      Optional<Instant> expireTime,
      Optional<String> displayName,
      Optional<List<Content>> contents,
      Optional<Content> systemInstruction,
      Optional<List<Tool>> tools,
      Optional<ToolConfig> toolConfig,
      Optional<String> kmsKeyName) {
    this.httpOptions = httpOptions;
    this.ttl = ttl;
    this.expireTime = expireTime;
    this.displayName = displayName;
    this.contents = contents;
    this.systemInstruction = systemInstruction;
    this.tools = tools;
    this.toolConfig = toolConfig;
    this.kmsKeyName = kmsKeyName;
  }

  @JsonProperty("httpOptions")
  @Override
  public Optional<HttpOptions> httpOptions() {
    return httpOptions;
  }

  @JsonProperty("ttl")
  @Override
  public Optional<Duration> ttl() {
    return ttl;
  }

  @JsonProperty("expireTime")
  @Override
  public Optional<Instant> expireTime() {
    return expireTime;
  }

  @JsonProperty("displayName")
  @Override
  public Optional<String> displayName() {
    return displayName;
  }

  @JsonProperty("contents")
  @Override
  public Optional<List<Content>> contents() {
    return contents;
  }

  @JsonProperty("systemInstruction")
  @Override
  public Optional<Content> systemInstruction() {
    return systemInstruction;
  }

  @JsonProperty("tools")
  @Override
  public Optional<List<Tool>> tools() {
    return tools;
  }

  @JsonProperty("toolConfig")
  @Override
  public Optional<ToolConfig> toolConfig() {
    return toolConfig;
  }

  @JsonProperty("kmsKeyName")
  @Override
  public Optional<String> kmsKeyName() {
    return kmsKeyName;
  }

  @Override
  public String toString() {
    return "CreateCachedContentConfig{"
        + "httpOptions=" + httpOptions + ", "
        + "ttl=" + ttl + ", "
        + "expireTime=" + expireTime + ", "
        + "displayName=" + displayName + ", "
        + "contents=" + contents + ", "
        + "systemInstruction=" + systemInstruction + ", "
        + "tools=" + tools + ", "
        + "toolConfig=" + toolConfig + ", "
        + "kmsKeyName=" + kmsKeyName
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CreateCachedContentConfig) {
      CreateCachedContentConfig that = (CreateCachedContentConfig) o;
      return this.httpOptions.equals(that.httpOptions())
          && this.ttl.equals(that.ttl())
          && this.expireTime.equals(that.expireTime())
          && this.displayName.equals(that.displayName())
          && this.contents.equals(that.contents())
          && this.systemInstruction.equals(that.systemInstruction())
          && this.tools.equals(that.tools())
          && this.toolConfig.equals(that.toolConfig())
          && this.kmsKeyName.equals(that.kmsKeyName());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= httpOptions.hashCode();
    h$ *= 1000003;
    h$ ^= ttl.hashCode();
    h$ *= 1000003;
    h$ ^= expireTime.hashCode();
    h$ *= 1000003;
    h$ ^= displayName.hashCode();
    h$ *= 1000003;
    h$ ^= contents.hashCode();
    h$ *= 1000003;
    h$ ^= systemInstruction.hashCode();
    h$ *= 1000003;
    h$ ^= tools.hashCode();
    h$ *= 1000003;
    h$ ^= toolConfig.hashCode();
    h$ *= 1000003;
    h$ ^= kmsKeyName.hashCode();
    return h$;
  }

  @Override
  public CreateCachedContentConfig.Builder toBuilder() {
    return new AutoValue_CreateCachedContentConfig.Builder(this);
  }

  static final class Builder extends CreateCachedContentConfig.Builder {
    private Optional<HttpOptions> httpOptions = Optional.empty();
    private Optional<Duration> ttl = Optional.empty();
    private Optional<Instant> expireTime = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<List<Content>> contents = Optional.empty();
    private Optional<Content> systemInstruction = Optional.empty();
    private Optional<List<Tool>> tools = Optional.empty();
    private Optional<ToolConfig> toolConfig = Optional.empty();
    private Optional<String> kmsKeyName = Optional.empty();
    Builder() {
    }
    Builder(CreateCachedContentConfig source) {
      this.httpOptions = source.httpOptions();
      this.ttl = source.ttl();
      this.expireTime = source.expireTime();
      this.displayName = source.displayName();
      this.contents = source.contents();
      this.systemInstruction = source.systemInstruction();
      this.tools = source.tools();
      this.toolConfig = source.toolConfig();
      this.kmsKeyName = source.kmsKeyName();
    }
    @Override
    public CreateCachedContentConfig.Builder httpOptions(HttpOptions httpOptions) {
      this.httpOptions = Optional.of(httpOptions);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder httpOptions(Optional<HttpOptions> httpOptions) {
      if (httpOptions == null) {
        throw new NullPointerException("Null httpOptions");
      }
      this.httpOptions = httpOptions;
      return this;
    }
    @Override
    public CreateCachedContentConfig.Builder ttl(Duration ttl) {
      this.ttl = Optional.of(ttl);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder ttl(Optional<Duration> ttl) {
      if (ttl == null) {
        throw new NullPointerException("Null ttl");
      }
      this.ttl = ttl;
      return this;
    }
    @Override
    public CreateCachedContentConfig.Builder expireTime(Instant expireTime) {
      this.expireTime = Optional.of(expireTime);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder expireTime(Optional<Instant> expireTime) {
      if (expireTime == null) {
        throw new NullPointerException("Null expireTime");
      }
      this.expireTime = expireTime;
      return this;
    }
    @Override
    public CreateCachedContentConfig.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public CreateCachedContentConfig.Builder contents(List<Content> contents) {
      this.contents = Optional.of(contents);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder contents(Optional<List<Content>> contents) {
      if (contents == null) {
        throw new NullPointerException("Null contents");
      }
      this.contents = contents;
      return this;
    }
    @Override
    public CreateCachedContentConfig.Builder systemInstruction(Content systemInstruction) {
      this.systemInstruction = Optional.of(systemInstruction);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder systemInstruction(Optional<Content> systemInstruction) {
      if (systemInstruction == null) {
        throw new NullPointerException("Null systemInstruction");
      }
      this.systemInstruction = systemInstruction;
      return this;
    }
    @Override
    public CreateCachedContentConfig.Builder tools(List<Tool> tools) {
      this.tools = Optional.of(tools);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder tools(Optional<List<Tool>> tools) {
      if (tools == null) {
        throw new NullPointerException("Null tools");
      }
      this.tools = tools;
      return this;
    }
    @Override
    public CreateCachedContentConfig.Builder toolConfig(ToolConfig toolConfig) {
      this.toolConfig = Optional.of(toolConfig);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder toolConfig(Optional<ToolConfig> toolConfig) {
      if (toolConfig == null) {
        throw new NullPointerException("Null toolConfig");
      }
      this.toolConfig = toolConfig;
      return this;
    }
    @Override
    public CreateCachedContentConfig.Builder kmsKeyName(String kmsKeyName) {
      this.kmsKeyName = Optional.of(kmsKeyName);
      return this;
    }
    @Override
    CreateCachedContentConfig.Builder kmsKeyName(Optional<String> kmsKeyName) {
      if (kmsKeyName == null) {
        throw new NullPointerException("Null kmsKeyName");
      }
      this.kmsKeyName = kmsKeyName;
      return this;
    }
    @Override
    public CreateCachedContentConfig build() {
      return new AutoValue_CreateCachedContentConfig(
          this.httpOptions,
          this.ttl,
          this.expireTime,
          this.displayName,
          this.contents,
          this.systemInstruction,
          this.tools,
          this.toolConfig,
          this.kmsKeyName);
    }
  }

}

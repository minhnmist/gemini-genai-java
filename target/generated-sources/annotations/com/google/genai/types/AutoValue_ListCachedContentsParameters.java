package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListCachedContentsParameters extends ListCachedContentsParameters {

  private final Optional<ListCachedContentsConfig> config;

  private AutoValue_ListCachedContentsParameters(
      Optional<ListCachedContentsConfig> config) {
    this.config = config;
  }

  @JsonProperty("config")
  @Override
  public Optional<ListCachedContentsConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "ListCachedContentsParameters{"
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListCachedContentsParameters) {
      ListCachedContentsParameters that = (ListCachedContentsParameters) o;
      return this.config.equals(that.config());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= config.hashCode();
    return h$;
  }

  @Override
  public ListCachedContentsParameters.Builder toBuilder() {
    return new AutoValue_ListCachedContentsParameters.Builder(this);
  }

  static final class Builder extends ListCachedContentsParameters.Builder {
    private Optional<ListCachedContentsConfig> config = Optional.empty();
    Builder() {
    }
    Builder(ListCachedContentsParameters source) {
      this.config = source.config();
    }
    @Override
    public ListCachedContentsParameters.Builder config(ListCachedContentsConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    ListCachedContentsParameters.Builder config(Optional<ListCachedContentsConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public ListCachedContentsParameters build() {
      return new AutoValue_ListCachedContentsParameters(
          this.config);
    }
  }

}

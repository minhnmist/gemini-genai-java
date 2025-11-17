package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ListFileSearchStoresParameters extends ListFileSearchStoresParameters {

  private final Optional<ListFileSearchStoresConfig> config;

  private AutoValue_ListFileSearchStoresParameters(
      Optional<ListFileSearchStoresConfig> config) {
    this.config = config;
  }

  @JsonProperty("config")
  @Override
  public Optional<ListFileSearchStoresConfig> config() {
    return config;
  }

  @Override
  public String toString() {
    return "ListFileSearchStoresParameters{"
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ListFileSearchStoresParameters) {
      ListFileSearchStoresParameters that = (ListFileSearchStoresParameters) o;
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
  public ListFileSearchStoresParameters.Builder toBuilder() {
    return new AutoValue_ListFileSearchStoresParameters.Builder(this);
  }

  static final class Builder extends ListFileSearchStoresParameters.Builder {
    private Optional<ListFileSearchStoresConfig> config = Optional.empty();
    Builder() {
    }
    Builder(ListFileSearchStoresParameters source) {
      this.config = source.config();
    }
    @Override
    public ListFileSearchStoresParameters.Builder config(ListFileSearchStoresConfig config) {
      this.config = Optional.of(config);
      return this;
    }
    @Override
    ListFileSearchStoresParameters.Builder config(Optional<ListFileSearchStoresConfig> config) {
      if (config == null) {
        throw new NullPointerException("Null config");
      }
      this.config = config;
      return this;
    }
    @Override
    public ListFileSearchStoresParameters build() {
      return new AutoValue_ListFileSearchStoresParameters(
          this.config);
    }
  }

}

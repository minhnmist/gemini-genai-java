package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CompletionStats extends CompletionStats {

  private final Optional<Long> failedCount;

  private final Optional<Long> incompleteCount;

  private final Optional<Long> successfulCount;

  private final Optional<Long> successfulForecastPointCount;

  private AutoValue_CompletionStats(
      Optional<Long> failedCount,
      Optional<Long> incompleteCount,
      Optional<Long> successfulCount,
      Optional<Long> successfulForecastPointCount) {
    this.failedCount = failedCount;
    this.incompleteCount = incompleteCount;
    this.successfulCount = successfulCount;
    this.successfulForecastPointCount = successfulForecastPointCount;
  }

  @JsonProperty("failedCount")
  @Override
  public Optional<Long> failedCount() {
    return failedCount;
  }

  @JsonProperty("incompleteCount")
  @Override
  public Optional<Long> incompleteCount() {
    return incompleteCount;
  }

  @JsonProperty("successfulCount")
  @Override
  public Optional<Long> successfulCount() {
    return successfulCount;
  }

  @JsonProperty("successfulForecastPointCount")
  @Override
  public Optional<Long> successfulForecastPointCount() {
    return successfulForecastPointCount;
  }

  @Override
  public String toString() {
    return "CompletionStats{"
        + "failedCount=" + failedCount + ", "
        + "incompleteCount=" + incompleteCount + ", "
        + "successfulCount=" + successfulCount + ", "
        + "successfulForecastPointCount=" + successfulForecastPointCount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CompletionStats) {
      CompletionStats that = (CompletionStats) o;
      return this.failedCount.equals(that.failedCount())
          && this.incompleteCount.equals(that.incompleteCount())
          && this.successfulCount.equals(that.successfulCount())
          && this.successfulForecastPointCount.equals(that.successfulForecastPointCount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= failedCount.hashCode();
    h$ *= 1000003;
    h$ ^= incompleteCount.hashCode();
    h$ *= 1000003;
    h$ ^= successfulCount.hashCode();
    h$ *= 1000003;
    h$ ^= successfulForecastPointCount.hashCode();
    return h$;
  }

  @Override
  public CompletionStats.Builder toBuilder() {
    return new AutoValue_CompletionStats.Builder(this);
  }

  static final class Builder extends CompletionStats.Builder {
    private Optional<Long> failedCount = Optional.empty();
    private Optional<Long> incompleteCount = Optional.empty();
    private Optional<Long> successfulCount = Optional.empty();
    private Optional<Long> successfulForecastPointCount = Optional.empty();
    Builder() {
    }
    Builder(CompletionStats source) {
      this.failedCount = source.failedCount();
      this.incompleteCount = source.incompleteCount();
      this.successfulCount = source.successfulCount();
      this.successfulForecastPointCount = source.successfulForecastPointCount();
    }
    @Override
    public CompletionStats.Builder failedCount(Long failedCount) {
      this.failedCount = Optional.of(failedCount);
      return this;
    }
    @Override
    CompletionStats.Builder failedCount(Optional<Long> failedCount) {
      if (failedCount == null) {
        throw new NullPointerException("Null failedCount");
      }
      this.failedCount = failedCount;
      return this;
    }
    @Override
    public CompletionStats.Builder incompleteCount(Long incompleteCount) {
      this.incompleteCount = Optional.of(incompleteCount);
      return this;
    }
    @Override
    CompletionStats.Builder incompleteCount(Optional<Long> incompleteCount) {
      if (incompleteCount == null) {
        throw new NullPointerException("Null incompleteCount");
      }
      this.incompleteCount = incompleteCount;
      return this;
    }
    @Override
    public CompletionStats.Builder successfulCount(Long successfulCount) {
      this.successfulCount = Optional.of(successfulCount);
      return this;
    }
    @Override
    CompletionStats.Builder successfulCount(Optional<Long> successfulCount) {
      if (successfulCount == null) {
        throw new NullPointerException("Null successfulCount");
      }
      this.successfulCount = successfulCount;
      return this;
    }
    @Override
    public CompletionStats.Builder successfulForecastPointCount(Long successfulForecastPointCount) {
      this.successfulForecastPointCount = Optional.of(successfulForecastPointCount);
      return this;
    }
    @Override
    CompletionStats.Builder successfulForecastPointCount(Optional<Long> successfulForecastPointCount) {
      if (successfulForecastPointCount == null) {
        throw new NullPointerException("Null successfulForecastPointCount");
      }
      this.successfulForecastPointCount = successfulForecastPointCount;
      return this;
    }
    @Override
    public CompletionStats build() {
      return new AutoValue_CompletionStats(
          this.failedCount,
          this.incompleteCount,
          this.successfulCount,
          this.successfulForecastPointCount);
    }
  }

}

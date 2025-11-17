package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DatasetDistributionDistributionBucket extends DatasetDistributionDistributionBucket {

  private final Optional<Long> count;

  private final Optional<Double> left;

  private final Optional<Double> right;

  private AutoValue_DatasetDistributionDistributionBucket(
      Optional<Long> count,
      Optional<Double> left,
      Optional<Double> right) {
    this.count = count;
    this.left = left;
    this.right = right;
  }

  @JsonProperty("count")
  @Override
  public Optional<Long> count() {
    return count;
  }

  @JsonProperty("left")
  @Override
  public Optional<Double> left() {
    return left;
  }

  @JsonProperty("right")
  @Override
  public Optional<Double> right() {
    return right;
  }

  @Override
  public String toString() {
    return "DatasetDistributionDistributionBucket{"
        + "count=" + count + ", "
        + "left=" + left + ", "
        + "right=" + right
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DatasetDistributionDistributionBucket) {
      DatasetDistributionDistributionBucket that = (DatasetDistributionDistributionBucket) o;
      return this.count.equals(that.count())
          && this.left.equals(that.left())
          && this.right.equals(that.right());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= count.hashCode();
    h$ *= 1000003;
    h$ ^= left.hashCode();
    h$ *= 1000003;
    h$ ^= right.hashCode();
    return h$;
  }

  @Override
  public DatasetDistributionDistributionBucket.Builder toBuilder() {
    return new AutoValue_DatasetDistributionDistributionBucket.Builder(this);
  }

  static final class Builder extends DatasetDistributionDistributionBucket.Builder {
    private Optional<Long> count = Optional.empty();
    private Optional<Double> left = Optional.empty();
    private Optional<Double> right = Optional.empty();
    Builder() {
    }
    Builder(DatasetDistributionDistributionBucket source) {
      this.count = source.count();
      this.left = source.left();
      this.right = source.right();
    }
    @Override
    public DatasetDistributionDistributionBucket.Builder count(Long count) {
      this.count = Optional.of(count);
      return this;
    }
    @Override
    DatasetDistributionDistributionBucket.Builder count(Optional<Long> count) {
      if (count == null) {
        throw new NullPointerException("Null count");
      }
      this.count = count;
      return this;
    }
    @Override
    public DatasetDistributionDistributionBucket.Builder left(Double left) {
      this.left = Optional.of(left);
      return this;
    }
    @Override
    DatasetDistributionDistributionBucket.Builder left(Optional<Double> left) {
      if (left == null) {
        throw new NullPointerException("Null left");
      }
      this.left = left;
      return this;
    }
    @Override
    public DatasetDistributionDistributionBucket.Builder right(Double right) {
      this.right = Optional.of(right);
      return this;
    }
    @Override
    DatasetDistributionDistributionBucket.Builder right(Optional<Double> right) {
      if (right == null) {
        throw new NullPointerException("Null right");
      }
      this.right = right;
      return this;
    }
    @Override
    public DatasetDistributionDistributionBucket build() {
      return new AutoValue_DatasetDistributionDistributionBucket(
          this.count,
          this.left,
          this.right);
    }
  }

}

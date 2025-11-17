package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SupervisedTuningDatasetDistributionDatasetBucket extends SupervisedTuningDatasetDistributionDatasetBucket {

  private final Optional<Double> count;

  private final Optional<Double> left;

  private final Optional<Double> right;

  private AutoValue_SupervisedTuningDatasetDistributionDatasetBucket(
      Optional<Double> count,
      Optional<Double> left,
      Optional<Double> right) {
    this.count = count;
    this.left = left;
    this.right = right;
  }

  @JsonProperty("count")
  @Override
  public Optional<Double> count() {
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
    return "SupervisedTuningDatasetDistributionDatasetBucket{"
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
    if (o instanceof SupervisedTuningDatasetDistributionDatasetBucket) {
      SupervisedTuningDatasetDistributionDatasetBucket that = (SupervisedTuningDatasetDistributionDatasetBucket) o;
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
  public SupervisedTuningDatasetDistributionDatasetBucket.Builder toBuilder() {
    return new AutoValue_SupervisedTuningDatasetDistributionDatasetBucket.Builder(this);
  }

  static final class Builder extends SupervisedTuningDatasetDistributionDatasetBucket.Builder {
    private Optional<Double> count = Optional.empty();
    private Optional<Double> left = Optional.empty();
    private Optional<Double> right = Optional.empty();
    Builder() {
    }
    Builder(SupervisedTuningDatasetDistributionDatasetBucket source) {
      this.count = source.count();
      this.left = source.left();
      this.right = source.right();
    }
    @Override
    public SupervisedTuningDatasetDistributionDatasetBucket.Builder count(Double count) {
      this.count = Optional.of(count);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistributionDatasetBucket.Builder count(Optional<Double> count) {
      if (count == null) {
        throw new NullPointerException("Null count");
      }
      this.count = count;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistributionDatasetBucket.Builder left(Double left) {
      this.left = Optional.of(left);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistributionDatasetBucket.Builder left(Optional<Double> left) {
      if (left == null) {
        throw new NullPointerException("Null left");
      }
      this.left = left;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistributionDatasetBucket.Builder right(Double right) {
      this.right = Optional.of(right);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistributionDatasetBucket.Builder right(Optional<Double> right) {
      if (right == null) {
        throw new NullPointerException("Null right");
      }
      this.right = right;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistributionDatasetBucket build() {
      return new AutoValue_SupervisedTuningDatasetDistributionDatasetBucket(
          this.count,
          this.left,
          this.right);
    }
  }

}

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SupervisedTuningDatasetDistribution extends SupervisedTuningDatasetDistribution {

  private final Optional<Long> billableSum;

  private final Optional<List<SupervisedTuningDatasetDistributionDatasetBucket>> buckets;

  private final Optional<Double> max;

  private final Optional<Double> mean;

  private final Optional<Double> median;

  private final Optional<Double> min;

  private final Optional<Double> p5;

  private final Optional<Double> p95;

  private final Optional<Long> sum;

  private AutoValue_SupervisedTuningDatasetDistribution(
      Optional<Long> billableSum,
      Optional<List<SupervisedTuningDatasetDistributionDatasetBucket>> buckets,
      Optional<Double> max,
      Optional<Double> mean,
      Optional<Double> median,
      Optional<Double> min,
      Optional<Double> p5,
      Optional<Double> p95,
      Optional<Long> sum) {
    this.billableSum = billableSum;
    this.buckets = buckets;
    this.max = max;
    this.mean = mean;
    this.median = median;
    this.min = min;
    this.p5 = p5;
    this.p95 = p95;
    this.sum = sum;
  }

  @JsonProperty("billableSum")
  @Override
  public Optional<Long> billableSum() {
    return billableSum;
  }

  @JsonProperty("buckets")
  @Override
  public Optional<List<SupervisedTuningDatasetDistributionDatasetBucket>> buckets() {
    return buckets;
  }

  @JsonProperty("max")
  @Override
  public Optional<Double> max() {
    return max;
  }

  @JsonProperty("mean")
  @Override
  public Optional<Double> mean() {
    return mean;
  }

  @JsonProperty("median")
  @Override
  public Optional<Double> median() {
    return median;
  }

  @JsonProperty("min")
  @Override
  public Optional<Double> min() {
    return min;
  }

  @JsonProperty("p5")
  @Override
  public Optional<Double> p5() {
    return p5;
  }

  @JsonProperty("p95")
  @Override
  public Optional<Double> p95() {
    return p95;
  }

  @JsonProperty("sum")
  @Override
  public Optional<Long> sum() {
    return sum;
  }

  @Override
  public String toString() {
    return "SupervisedTuningDatasetDistribution{"
        + "billableSum=" + billableSum + ", "
        + "buckets=" + buckets + ", "
        + "max=" + max + ", "
        + "mean=" + mean + ", "
        + "median=" + median + ", "
        + "min=" + min + ", "
        + "p5=" + p5 + ", "
        + "p95=" + p95 + ", "
        + "sum=" + sum
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SupervisedTuningDatasetDistribution) {
      SupervisedTuningDatasetDistribution that = (SupervisedTuningDatasetDistribution) o;
      return this.billableSum.equals(that.billableSum())
          && this.buckets.equals(that.buckets())
          && this.max.equals(that.max())
          && this.mean.equals(that.mean())
          && this.median.equals(that.median())
          && this.min.equals(that.min())
          && this.p5.equals(that.p5())
          && this.p95.equals(that.p95())
          && this.sum.equals(that.sum());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= billableSum.hashCode();
    h$ *= 1000003;
    h$ ^= buckets.hashCode();
    h$ *= 1000003;
    h$ ^= max.hashCode();
    h$ *= 1000003;
    h$ ^= mean.hashCode();
    h$ *= 1000003;
    h$ ^= median.hashCode();
    h$ *= 1000003;
    h$ ^= min.hashCode();
    h$ *= 1000003;
    h$ ^= p5.hashCode();
    h$ *= 1000003;
    h$ ^= p95.hashCode();
    h$ *= 1000003;
    h$ ^= sum.hashCode();
    return h$;
  }

  @Override
  public SupervisedTuningDatasetDistribution.Builder toBuilder() {
    return new AutoValue_SupervisedTuningDatasetDistribution.Builder(this);
  }

  static final class Builder extends SupervisedTuningDatasetDistribution.Builder {
    private Optional<Long> billableSum = Optional.empty();
    private Optional<List<SupervisedTuningDatasetDistributionDatasetBucket>> buckets = Optional.empty();
    private Optional<Double> max = Optional.empty();
    private Optional<Double> mean = Optional.empty();
    private Optional<Double> median = Optional.empty();
    private Optional<Double> min = Optional.empty();
    private Optional<Double> p5 = Optional.empty();
    private Optional<Double> p95 = Optional.empty();
    private Optional<Long> sum = Optional.empty();
    Builder() {
    }
    Builder(SupervisedTuningDatasetDistribution source) {
      this.billableSum = source.billableSum();
      this.buckets = source.buckets();
      this.max = source.max();
      this.mean = source.mean();
      this.median = source.median();
      this.min = source.min();
      this.p5 = source.p5();
      this.p95 = source.p95();
      this.sum = source.sum();
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder billableSum(Long billableSum) {
      this.billableSum = Optional.of(billableSum);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder billableSum(Optional<Long> billableSum) {
      if (billableSum == null) {
        throw new NullPointerException("Null billableSum");
      }
      this.billableSum = billableSum;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder buckets(List<SupervisedTuningDatasetDistributionDatasetBucket> buckets) {
      this.buckets = Optional.of(buckets);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder buckets(Optional<List<SupervisedTuningDatasetDistributionDatasetBucket>> buckets) {
      if (buckets == null) {
        throw new NullPointerException("Null buckets");
      }
      this.buckets = buckets;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder max(Double max) {
      this.max = Optional.of(max);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder max(Optional<Double> max) {
      if (max == null) {
        throw new NullPointerException("Null max");
      }
      this.max = max;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder mean(Double mean) {
      this.mean = Optional.of(mean);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder mean(Optional<Double> mean) {
      if (mean == null) {
        throw new NullPointerException("Null mean");
      }
      this.mean = mean;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder median(Double median) {
      this.median = Optional.of(median);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder median(Optional<Double> median) {
      if (median == null) {
        throw new NullPointerException("Null median");
      }
      this.median = median;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder min(Double min) {
      this.min = Optional.of(min);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder min(Optional<Double> min) {
      if (min == null) {
        throw new NullPointerException("Null min");
      }
      this.min = min;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder p5(Double p5) {
      this.p5 = Optional.of(p5);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder p5(Optional<Double> p5) {
      if (p5 == null) {
        throw new NullPointerException("Null p5");
      }
      this.p5 = p5;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder p95(Double p95) {
      this.p95 = Optional.of(p95);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder p95(Optional<Double> p95) {
      if (p95 == null) {
        throw new NullPointerException("Null p95");
      }
      this.p95 = p95;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution.Builder sum(Long sum) {
      this.sum = Optional.of(sum);
      return this;
    }
    @Override
    SupervisedTuningDatasetDistribution.Builder sum(Optional<Long> sum) {
      if (sum == null) {
        throw new NullPointerException("Null sum");
      }
      this.sum = sum;
      return this;
    }
    @Override
    public SupervisedTuningDatasetDistribution build() {
      return new AutoValue_SupervisedTuningDatasetDistribution(
          this.billableSum,
          this.buckets,
          this.max,
          this.mean,
          this.median,
          this.min,
          this.p5,
          this.p95,
          this.sum);
    }
  }

}

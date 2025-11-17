package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_BatchJob extends BatchJob {

  private final Optional<String> name;

  private final Optional<String> displayName;

  private final Optional<JobState> state;

  private final Optional<JobError> error;

  private final Optional<Instant> createTime;

  private final Optional<Instant> startTime;

  private final Optional<Instant> endTime;

  private final Optional<Instant> updateTime;

  private final Optional<String> model;

  private final Optional<BatchJobSource> src;

  private final Optional<BatchJobDestination> dest;

  private final Optional<CompletionStats> completionStats;

  private AutoValue_BatchJob(
      Optional<String> name,
      Optional<String> displayName,
      Optional<JobState> state,
      Optional<JobError> error,
      Optional<Instant> createTime,
      Optional<Instant> startTime,
      Optional<Instant> endTime,
      Optional<Instant> updateTime,
      Optional<String> model,
      Optional<BatchJobSource> src,
      Optional<BatchJobDestination> dest,
      Optional<CompletionStats> completionStats) {
    this.name = name;
    this.displayName = displayName;
    this.state = state;
    this.error = error;
    this.createTime = createTime;
    this.startTime = startTime;
    this.endTime = endTime;
    this.updateTime = updateTime;
    this.model = model;
    this.src = src;
    this.dest = dest;
    this.completionStats = completionStats;
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

  @JsonProperty("state")
  @Override
  public Optional<JobState> state() {
    return state;
  }

  @JsonProperty("error")
  @Override
  public Optional<JobError> error() {
    return error;
  }

  @JsonProperty("createTime")
  @Override
  public Optional<Instant> createTime() {
    return createTime;
  }

  @JsonProperty("startTime")
  @Override
  public Optional<Instant> startTime() {
    return startTime;
  }

  @JsonProperty("endTime")
  @Override
  public Optional<Instant> endTime() {
    return endTime;
  }

  @JsonProperty("updateTime")
  @Override
  public Optional<Instant> updateTime() {
    return updateTime;
  }

  @JsonProperty("model")
  @Override
  public Optional<String> model() {
    return model;
  }

  @JsonProperty("src")
  @Override
  public Optional<BatchJobSource> src() {
    return src;
  }

  @JsonProperty("dest")
  @Override
  public Optional<BatchJobDestination> dest() {
    return dest;
  }

  @JsonProperty("completionStats")
  @Override
  public Optional<CompletionStats> completionStats() {
    return completionStats;
  }

  @Override
  public String toString() {
    return "BatchJob{"
        + "name=" + name + ", "
        + "displayName=" + displayName + ", "
        + "state=" + state + ", "
        + "error=" + error + ", "
        + "createTime=" + createTime + ", "
        + "startTime=" + startTime + ", "
        + "endTime=" + endTime + ", "
        + "updateTime=" + updateTime + ", "
        + "model=" + model + ", "
        + "src=" + src + ", "
        + "dest=" + dest + ", "
        + "completionStats=" + completionStats
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BatchJob) {
      BatchJob that = (BatchJob) o;
      return this.name.equals(that.name())
          && this.displayName.equals(that.displayName())
          && this.state.equals(that.state())
          && this.error.equals(that.error())
          && this.createTime.equals(that.createTime())
          && this.startTime.equals(that.startTime())
          && this.endTime.equals(that.endTime())
          && this.updateTime.equals(that.updateTime())
          && this.model.equals(that.model())
          && this.src.equals(that.src())
          && this.dest.equals(that.dest())
          && this.completionStats.equals(that.completionStats());
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
    h$ ^= state.hashCode();
    h$ *= 1000003;
    h$ ^= error.hashCode();
    h$ *= 1000003;
    h$ ^= createTime.hashCode();
    h$ *= 1000003;
    h$ ^= startTime.hashCode();
    h$ *= 1000003;
    h$ ^= endTime.hashCode();
    h$ *= 1000003;
    h$ ^= updateTime.hashCode();
    h$ *= 1000003;
    h$ ^= model.hashCode();
    h$ *= 1000003;
    h$ ^= src.hashCode();
    h$ *= 1000003;
    h$ ^= dest.hashCode();
    h$ *= 1000003;
    h$ ^= completionStats.hashCode();
    return h$;
  }

  @Override
  public BatchJob.Builder toBuilder() {
    return new AutoValue_BatchJob.Builder(this);
  }

  static final class Builder extends BatchJob.Builder {
    private Optional<String> name = Optional.empty();
    private Optional<String> displayName = Optional.empty();
    private Optional<JobState> state = Optional.empty();
    private Optional<JobError> error = Optional.empty();
    private Optional<Instant> createTime = Optional.empty();
    private Optional<Instant> startTime = Optional.empty();
    private Optional<Instant> endTime = Optional.empty();
    private Optional<Instant> updateTime = Optional.empty();
    private Optional<String> model = Optional.empty();
    private Optional<BatchJobSource> src = Optional.empty();
    private Optional<BatchJobDestination> dest = Optional.empty();
    private Optional<CompletionStats> completionStats = Optional.empty();
    Builder() {
    }
    Builder(BatchJob source) {
      this.name = source.name();
      this.displayName = source.displayName();
      this.state = source.state();
      this.error = source.error();
      this.createTime = source.createTime();
      this.startTime = source.startTime();
      this.endTime = source.endTime();
      this.updateTime = source.updateTime();
      this.model = source.model();
      this.src = source.src();
      this.dest = source.dest();
      this.completionStats = source.completionStats();
    }
    @Override
    public BatchJob.Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }
    @Override
    BatchJob.Builder name(Optional<String> name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    public BatchJob.Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }
    @Override
    BatchJob.Builder displayName(Optional<String> displayName) {
      if (displayName == null) {
        throw new NullPointerException("Null displayName");
      }
      this.displayName = displayName;
      return this;
    }
    @Override
    public BatchJob.Builder state(JobState state) {
      this.state = Optional.of(state);
      return this;
    }
    @Override
    BatchJob.Builder state(Optional<JobState> state) {
      if (state == null) {
        throw new NullPointerException("Null state");
      }
      this.state = state;
      return this;
    }
    @Override
    public BatchJob.Builder error(JobError error) {
      this.error = Optional.of(error);
      return this;
    }
    @Override
    BatchJob.Builder error(Optional<JobError> error) {
      if (error == null) {
        throw new NullPointerException("Null error");
      }
      this.error = error;
      return this;
    }
    @Override
    public BatchJob.Builder createTime(Instant createTime) {
      this.createTime = Optional.of(createTime);
      return this;
    }
    @Override
    BatchJob.Builder createTime(Optional<Instant> createTime) {
      if (createTime == null) {
        throw new NullPointerException("Null createTime");
      }
      this.createTime = createTime;
      return this;
    }
    @Override
    public BatchJob.Builder startTime(Instant startTime) {
      this.startTime = Optional.of(startTime);
      return this;
    }
    @Override
    BatchJob.Builder startTime(Optional<Instant> startTime) {
      if (startTime == null) {
        throw new NullPointerException("Null startTime");
      }
      this.startTime = startTime;
      return this;
    }
    @Override
    public BatchJob.Builder endTime(Instant endTime) {
      this.endTime = Optional.of(endTime);
      return this;
    }
    @Override
    BatchJob.Builder endTime(Optional<Instant> endTime) {
      if (endTime == null) {
        throw new NullPointerException("Null endTime");
      }
      this.endTime = endTime;
      return this;
    }
    @Override
    public BatchJob.Builder updateTime(Instant updateTime) {
      this.updateTime = Optional.of(updateTime);
      return this;
    }
    @Override
    BatchJob.Builder updateTime(Optional<Instant> updateTime) {
      if (updateTime == null) {
        throw new NullPointerException("Null updateTime");
      }
      this.updateTime = updateTime;
      return this;
    }
    @Override
    public BatchJob.Builder model(String model) {
      this.model = Optional.of(model);
      return this;
    }
    @Override
    BatchJob.Builder model(Optional<String> model) {
      if (model == null) {
        throw new NullPointerException("Null model");
      }
      this.model = model;
      return this;
    }
    @Override
    public BatchJob.Builder src(BatchJobSource src) {
      this.src = Optional.of(src);
      return this;
    }
    @Override
    BatchJob.Builder src(Optional<BatchJobSource> src) {
      if (src == null) {
        throw new NullPointerException("Null src");
      }
      this.src = src;
      return this;
    }
    @Override
    public BatchJob.Builder dest(BatchJobDestination dest) {
      this.dest = Optional.of(dest);
      return this;
    }
    @Override
    BatchJob.Builder dest(Optional<BatchJobDestination> dest) {
      if (dest == null) {
        throw new NullPointerException("Null dest");
      }
      this.dest = dest;
      return this;
    }
    @Override
    public BatchJob.Builder completionStats(CompletionStats completionStats) {
      this.completionStats = Optional.of(completionStats);
      return this;
    }
    @Override
    BatchJob.Builder completionStats(Optional<CompletionStats> completionStats) {
      if (completionStats == null) {
        throw new NullPointerException("Null completionStats");
      }
      this.completionStats = completionStats;
      return this;
    }
    @Override
    public BatchJob build() {
      return new AutoValue_BatchJob(
          this.name,
          this.displayName,
          this.state,
          this.error,
          this.createTime,
          this.startTime,
          this.endTime,
          this.updateTime,
          this.model,
          this.src,
          this.dest,
          this.completionStats);
    }
  }

}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Yearly retention schedule. */
@Fluent
public final class YearlyRetentionSchedule {
    /*
     * Retention schedule format for yearly retention policy.
     */
    @JsonProperty(value = "retentionScheduleFormatType")
    private RetentionScheduleFormat retentionScheduleFormatType;

    /*
     * List of months of year of yearly retention policy.
     */
    @JsonProperty(value = "monthsOfYear")
    private List<MonthOfYear> monthsOfYear;

    /*
     * Daily retention format for yearly retention policy.
     */
    @JsonProperty(value = "retentionScheduleDaily")
    private DailyRetentionFormat retentionScheduleDaily;

    /*
     * Weekly retention format for yearly retention policy.
     */
    @JsonProperty(value = "retentionScheduleWeekly")
    private WeeklyRetentionFormat retentionScheduleWeekly;

    /*
     * Retention times of retention policy.
     */
    @JsonProperty(value = "retentionTimes")
    private List<OffsetDateTime> retentionTimes;

    /*
     * Retention duration of retention Policy.
     */
    @JsonProperty(value = "retentionDuration")
    private RetentionDuration retentionDuration;

    /**
     * Get the retentionScheduleFormatType property: Retention schedule format for yearly retention policy.
     *
     * @return the retentionScheduleFormatType value.
     */
    public RetentionScheduleFormat retentionScheduleFormatType() {
        return this.retentionScheduleFormatType;
    }

    /**
     * Set the retentionScheduleFormatType property: Retention schedule format for yearly retention policy.
     *
     * @param retentionScheduleFormatType the retentionScheduleFormatType value to set.
     * @return the YearlyRetentionSchedule object itself.
     */
    public YearlyRetentionSchedule withRetentionScheduleFormatType(
        RetentionScheduleFormat retentionScheduleFormatType) {
        this.retentionScheduleFormatType = retentionScheduleFormatType;
        return this;
    }

    /**
     * Get the monthsOfYear property: List of months of year of yearly retention policy.
     *
     * @return the monthsOfYear value.
     */
    public List<MonthOfYear> monthsOfYear() {
        return this.monthsOfYear;
    }

    /**
     * Set the monthsOfYear property: List of months of year of yearly retention policy.
     *
     * @param monthsOfYear the monthsOfYear value to set.
     * @return the YearlyRetentionSchedule object itself.
     */
    public YearlyRetentionSchedule withMonthsOfYear(List<MonthOfYear> monthsOfYear) {
        this.monthsOfYear = monthsOfYear;
        return this;
    }

    /**
     * Get the retentionScheduleDaily property: Daily retention format for yearly retention policy.
     *
     * @return the retentionScheduleDaily value.
     */
    public DailyRetentionFormat retentionScheduleDaily() {
        return this.retentionScheduleDaily;
    }

    /**
     * Set the retentionScheduleDaily property: Daily retention format for yearly retention policy.
     *
     * @param retentionScheduleDaily the retentionScheduleDaily value to set.
     * @return the YearlyRetentionSchedule object itself.
     */
    public YearlyRetentionSchedule withRetentionScheduleDaily(DailyRetentionFormat retentionScheduleDaily) {
        this.retentionScheduleDaily = retentionScheduleDaily;
        return this;
    }

    /**
     * Get the retentionScheduleWeekly property: Weekly retention format for yearly retention policy.
     *
     * @return the retentionScheduleWeekly value.
     */
    public WeeklyRetentionFormat retentionScheduleWeekly() {
        return this.retentionScheduleWeekly;
    }

    /**
     * Set the retentionScheduleWeekly property: Weekly retention format for yearly retention policy.
     *
     * @param retentionScheduleWeekly the retentionScheduleWeekly value to set.
     * @return the YearlyRetentionSchedule object itself.
     */
    public YearlyRetentionSchedule withRetentionScheduleWeekly(WeeklyRetentionFormat retentionScheduleWeekly) {
        this.retentionScheduleWeekly = retentionScheduleWeekly;
        return this;
    }

    /**
     * Get the retentionTimes property: Retention times of retention policy.
     *
     * @return the retentionTimes value.
     */
    public List<OffsetDateTime> retentionTimes() {
        return this.retentionTimes;
    }

    /**
     * Set the retentionTimes property: Retention times of retention policy.
     *
     * @param retentionTimes the retentionTimes value to set.
     * @return the YearlyRetentionSchedule object itself.
     */
    public YearlyRetentionSchedule withRetentionTimes(List<OffsetDateTime> retentionTimes) {
        this.retentionTimes = retentionTimes;
        return this;
    }

    /**
     * Get the retentionDuration property: Retention duration of retention Policy.
     *
     * @return the retentionDuration value.
     */
    public RetentionDuration retentionDuration() {
        return this.retentionDuration;
    }

    /**
     * Set the retentionDuration property: Retention duration of retention Policy.
     *
     * @param retentionDuration the retentionDuration value to set.
     * @return the YearlyRetentionSchedule object itself.
     */
    public YearlyRetentionSchedule withRetentionDuration(RetentionDuration retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (retentionScheduleDaily() != null) {
            retentionScheduleDaily().validate();
        }
        if (retentionScheduleWeekly() != null) {
            retentionScheduleWeekly().validate();
        }
        if (retentionDuration() != null) {
            retentionDuration().validate();
        }
    }
}

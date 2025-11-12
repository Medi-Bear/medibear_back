package com.app.medibear.entity;

import com.app.medibear.entity.Member;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "daily_activities_tb")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DailyActivities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private Double sleepHours;
    private Double caffeineMg;
    private Double alcoholConsumption;
    private Double physicalActivityHours;
    private Double predictedSleepQuality;
    private Double predictedFatigueScore;

    @Column(length = 255)
    private String recommendedSleepRange;

    @Column(length = 255)
    private String conditionLevel;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_no", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Member member;
}

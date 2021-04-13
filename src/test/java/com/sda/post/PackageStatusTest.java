package com.sda.post;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

//Zadanie 10.2
class PackageStatusTest {

    @Test
    void getNextStatusesTestforSent () {
        //Given
        PackageStatus [] nextSentStatuses = PackageStatus.SENT.getNextStatuses();
        //Wenn
        PackageStatus [] nextSentStatusesShouldBe = {PackageStatus.TRAVELING, PackageStatus.LOST};

        //Then
        Assertions.assertThat(nextSentStatuses)
                .isEqualTo(nextSentStatusesShouldBe);
    }

    @Test
    void getNextStatusesTestforTraveling () {
        //Given
        PackageStatus [] nextSentStatuses = PackageStatus.TRAVELING.getNextStatuses();
        //Wenn
        PackageStatus [] nextSentStatusesShouldBe = {PackageStatus.COURIER, PackageStatus.LOST};

        //Then
        Assertions.assertThat(nextSentStatuses)
                .isEqualTo(nextSentStatusesShouldBe);
    }

    @Test
    void getNextStatusesTestforCourier () {
        //Given
        PackageStatus [] nextSentStatuses = PackageStatus.COURIER.getNextStatuses();
        //Wenn
        PackageStatus [] nextSentStatusesShouldBe = {PackageStatus.DELIVERED, PackageStatus.RETURNED, PackageStatus.LOST};

        //Then
        Assertions.assertThat(nextSentStatuses)
                .isEqualTo(nextSentStatusesShouldBe);
    }

    @Test
    void getNextStatusesTestforDelivered() {
        //Given
        PackageStatus [] nextSentStatuses = PackageStatus.DELIVERED.getNextStatuses();
        //Wenn
        PackageStatus [] nextSentStatusesShouldBe = {};

        //Then
        Assertions.assertThat(nextSentStatuses)
                .isEqualTo(nextSentStatusesShouldBe);
    }

    @Test
    void getNextStatusesTestforLost() {
        //Given
        PackageStatus [] nextSentStatuses = PackageStatus.LOST.getNextStatuses();
        //Wenn
        PackageStatus [] nextSentStatusesShouldBe = {};

        //Then
        Assertions.assertThat(nextSentStatuses)
                .isEqualTo(nextSentStatusesShouldBe);
    }

    @Test
    void getNextStatusesTestforReturned() {
        //Given
        PackageStatus [] nextSentStatuses = PackageStatus.RETURNED.getNextStatuses();
        //Wenn
        PackageStatus [] nextSentStatusesShouldBe = {};

        //Then
        Assertions.assertThat(nextSentStatuses)
                .isEqualTo(nextSentStatusesShouldBe);
    }
}
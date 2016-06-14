package de.gymondo.samples.restapi.transformation;

import com.google.common.collect.ImmutableList;
import de.gymondo.samples.commons.entity.Subscription;
import de.gymondo.samples.commons.entity.User;
import de.gymondo.samples.commons.repository.SubscriptionRepository;
import de.gymondo.samples.restapi.dto.SubscriptionV1Dto;
import de.gymondo.samples.restapi.dto.UserV1Dto;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Transformation utility service.
 *
 * @author Rui Vilao (rui@gymondo.de)
 */
public class TransformationsV1 {

    private final SubscriptionRepository subscriptionRepository = new SubscriptionRepository();

    public List<UserV1Dto> user2Dto(List<User> users) {
        /*
         * TODO: Write this method.
         *
         * Enrich the user information with all the subscriptions that belong to him/her.
         *
         * Hint: Think that users might be a huge list so we would like to minimize
         * the IO impact when going to the database. You can change the signature of the method
         * as you wish to make it work.
         */

        return users.stream().map(x ->
                UserV1Dto.builder()
                        .withAge(x.getAge())
                        .withId(x.getId())
                        .withName(x.getName())
                        .withGender(x.getGender())
                        .build())
                .collect(Collectors.toList());
    }

    public UserV1Dto user2Dto(User user) {
        if (user == null) {
            return null;
        }

        return user2Dto(ImmutableList.of(user)).get(0);
    }

    public List<SubscriptionV1Dto> subscription2Dto(List<Subscription> subscriptions) {
        return subscriptions.stream().map(this::subscription2Dto).collect(Collectors.toList());
    }

    public SubscriptionV1Dto subscription2Dto(Subscription subscription) {
        if (subscription == null) {
            return null;
        }

        /*
         * TODO: Include the expiration date in the DTO.
         */

        return SubscriptionV1Dto.builder()
                .withId(subscription.getId())
                .withName(subscription.getName())
                .build();
    }
}

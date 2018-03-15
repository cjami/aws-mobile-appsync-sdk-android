/**
 * Copyright 2018-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.exception.ApolloException;

@SuppressWarnings("WeakerAccess")
public class ApolloSubscriptionException extends ApolloException {

    public ApolloSubscriptionException(String message) {
        super(message);
    }

    public ApolloSubscriptionException(String message, Throwable cause) {
        super(message, cause);
    }
}

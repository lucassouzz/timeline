package com.dev.timeline.core.factory;

import com.dev.timeline.user.User;
import com.dev.timeline.user.payload.UserPayload;

public interface BaseFactory<ENTITY, PAYLOAD> {

    ENTITY toEntity(PAYLOAD payload);

    PAYLOAD toPayload(ENTITY entity);
}

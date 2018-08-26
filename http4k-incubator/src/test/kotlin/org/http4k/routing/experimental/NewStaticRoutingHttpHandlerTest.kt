package org.http4k.routing.experimental

import org.http4k.routing.RoutingHttpHandler
import org.http4k.routing.StaticRoutingHttpHandlerTest

class NewStaticRoutingHttpHandlerTest : StaticRoutingHttpHandlerTest() {
    override val handler: RoutingHttpHandler = StaticRoutingHttpHandler(
        pathSegments = validPath,
        resourceLoader = ResourceLoaders.Classpath()
    )
}
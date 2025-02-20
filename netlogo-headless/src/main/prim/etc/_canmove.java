// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.etc;

import org.nlogo.nvm.Context;
import org.nlogo.nvm.Reporter;

public final class _canmove
    extends Reporter {
    @Override
  public Object report(final Context context) {
    double distance = argEvalDoubleValue(context, 0);
    org.nlogo.agent.Turtle turtle = (org.nlogo.agent.Turtle) context.agent;
    try {
      world.protractor().getPatchAtHeadingAndDistance(turtle.xcor(), turtle.ycor(), turtle.heading(), distance);
    } catch (org.nlogo.api.AgentException exc) {
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }
}

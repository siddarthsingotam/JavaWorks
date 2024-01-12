## Task 1

### a) Arrival Event Generation

In the simulation system, the arrival event plays a crucial role in maintaining the continuous flow of arrivals. When a
customer arrives, it triggers the generation of the next arrival event. This recursive approach ensures that the
simulation accurately represents the dynamic nature of arrivals.

### b) Service Event Handling

The initiation of a service is complemented by the generation of a finish service event. This event symbolizes the
completion of the ongoing service and is essential for advancing the simulation. Upon the commencement of a service, a
corresponding finish service event is scheduled to occur after the service time has elapsed. This mechanism allows the
simulation to keep track of when each service will be completed.

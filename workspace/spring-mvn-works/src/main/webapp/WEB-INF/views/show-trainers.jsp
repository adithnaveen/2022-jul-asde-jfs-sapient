
<%@ include file="./header.jspf" %>

	<div class="alert alert-danger">
		<div class="container">
			<h3 style="align:center">${TITLE}</h3>
		</div>
	</div>


	<div style="min-height: 500px">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>#</th>
					<th>Trainer ID</th>
					<th>Trainer Name</th>
					<th>Trainer Email</th>
					<th>Trainer Income</th>
				</tr>
			</thead>
			
			<tbody>
				<ps:forEach items="${TRAINERS}" var="t" varStatus="status">
					<tr>
						<td>${status.index+1}</td>
						<td>${t.trainerId}</td>
						<td>${t.trainerName }</td>
						<td>${t.trainerEmail }</td>
						<td>${t.trainerIncome }</td>
					</tr>
				</ps:forEach>
			</tbody>
		</table>
	</div>

<%@ include file="./footer.jspf" %>
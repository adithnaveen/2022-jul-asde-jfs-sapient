<%@ include file="./header.jspf"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<div class="row">
	<div class="col">
		<form:form modelAttribute="trainer" action="" method="post">
			<div class="row">
				<div class="col col-md-6">
					<div class="row md-3">
						<label for="trainerId" class="col-sm-2 col-form-label">Trainer
							ID</label>
						<div class="col-sm-10">
							<form:input path="trainerId" cssClass="form-control" />
						</div>
					</div>

					<div class="row md-3">
						<label for=trainerName class="col-sm-2 col-form-label">trainerName</label>
						<div class="col-sm-10">
							<form:input path="trainerName" cssClass="form-control" />
						</div>
					</div>


					<div class="row md-3">
						<label for="trainerEmail" class="col-sm-2 col-form-label">trainerEmail</label>
						<div class="col-sm-10">
							<form:input path="trainerEmail" cssClass="form-control" />
						</div>
					</div>

					<div class="row md-3">
						<label for="trainerIncome" class="col-sm-2 col-form-label">trainerIncome</label>
						<div class="col-sm-10">
							<form:input path="trainerIncome" cssClass="form-control" />
						</div>
					</div>
				</div>
				
				<button class="btn btn-danger">Submit</button>
			</div>
		</form:form>
	</div>
</div>



<%@ include file="./footer.jspf"%>
### **Код SQL для реализации БД поликлиники**

Patients_profile {
	patient_id integer pk increments unique
	surname text
	name text
	patronymic text
	sex binary
	birthdate date
	policy_type integer
	policy_number integer
	login text
	hash_password text
}

Doctors_profile {
	doctor_id integer pk increments
	surname text
	name text
	patronymic text
	sex binary
	birthdate date
	specialization text
	academic_degree text
	self_recording binary
	recording_by_doctor binary
	room_number integer
	login text
	hash_password text
}

Records {
	record_id integer pk increments
	patient_id integer *>* Patients_profile.patient_id
	visit_datetime_begin datetime *>* admission_schedule.datetime_begin
	visit_datetime_end datetime *>* admission_schedule.datetime_end
	doctor_id integer *>* Doctors_profile.doctor_id
	doctor_specialization text *>* Doctors_profile.specialization
	self_recording binary *>* Doctors_profile.self_recording
}

Recipes {
	recipe_id integer pk increments
	doctor_id integer *>* Doctors_profile.doctor_id
	patient_id integer *>* Patients_profile.patient_id
	recipe_date date
	description text *>* Docs_appointment.recipe
}

Directions {
	direction_id integer pk increments
	doctor_id integer *>* Doctors_profile.doctor_id
	patient_id integer *>* Patients_profile.patient_id
	datetime datetime
	room_number integer *>* Doctors_profile.room_number
	description text
	diagnosis text null *>* Docs_appointment.diagnosis
}

Admission_schedule {
	ad_sched_id integer pk increments
	doctor_id integer *>* Doctors_profile.doctor_id
	datetime_begin datetime
	datetime_end datetime
}

Duty_shift_schedule {
	dy_sh_sched_id integer pk increments
	doctor_id integer *>* Doctors_profile.doctor_id
	datetime_begin datetime
	datetime_end datetime
	room_number integer
}

Docs_appointment {
	id integer pk increments
	id_record integer > Records.record_id
	datetime_begin datetime > Records.visit_datetime_begin
	datetime_end datetime > Records.visit_datetime_end
	patient_id integer *>* Patients_profile.patient_id
	doctors_id integer *>* Doctors_profile.doctor_id
	diagnosis text null > Directions.diagnosis
	recipe integer null *>* Recipes.recipe_id
	send_to_analysis integer null *>* Analyzes.analysis_id
	send_to_doctors integer null *>* Doctors_profile.recording_by_doctor
	result_of_analysis text null > Analyzes.result
}

Analyzes {
	analysis_id integer pk increments
	patient_id integer *>* Patients_profile.patient_id
	doctor_id integer *>* Doctors_profile.doctor_id
	datetime datetime
	room integer
	description text
	result text
}

Patients_list {
	id integer pk increments > Patients_profile.patient_id
	patients_name text > Patients_profile.name
	uch integer
	diagnosis text *>* Docs_appointment.diagnosis
	recipes text *>* Recipes.description
	analyzes text *>* Analyzes.result
}


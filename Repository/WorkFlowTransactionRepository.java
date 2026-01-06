package com.TaskManagement.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TaskManagement.Entity.WorkFlowTransaction;
import com.TaskManagement.Entity.WorkFlowTransactions;
import com.TaskManagement.Enum.IssueStatus;


@Repository
public interface WorkFlowTransactionRepository extends JpaRepository<WorkFlowTransactions,Long> {

	Optional<WorkFlowTransaction>finfByWorkFlowIdAndFromStatusandToStatus(Long workFlowId,IssueStatus fromStatus,IssueStatus toStatus);
}

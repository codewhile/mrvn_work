package marcus.av1.infra.http.interfaces;

import marcus.av1.domain.entities.PaymentInformartion;

public interface IPayMethod {

	Boolean pay(PaymentInformartion information);
	
}

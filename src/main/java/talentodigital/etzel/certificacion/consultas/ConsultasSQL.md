

# Consulta A

	SELECT id, usuario_id, tipo, saldo
	FROM cuenta
	WHERE tipo = 'Ahorro' AND saldo > 1000
	ORDER BY saldo DESC;
	
# Consulta B

	SELECT AVG(saldo) AS promedio
	FROM cuenta
	WHERE tipo = 'Corriente' OR saldo > 5000;

# Consulta C

	SELECT COUNT(*) AS total_transacciones
	FROM transaccion
	WHERE fecha = '2023-07-19' AND cuenta_id IN (
	    SELECT id
	    FROM cuenta
	    WHERE saldo > 2000
	);

# Consulta D

	SELECT nombre
	FROM beneficiario
	WHERE cuenta_id = <ID_CUENTA> AND nombre IN ('Amigo 1', 'Amigo 2')
	ORDER BY nombre ASC;

# Consulta E

	SELECT SUM(saldo) AS saldo_total
	FROM cuenta
	WHERE tipo = 'Ahorro' AND saldo > 2000;

